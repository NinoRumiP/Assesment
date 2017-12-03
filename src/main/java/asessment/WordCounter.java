package asessment;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import asessment.rest.accessor.AlgoliaSerachResult;

public class WordCounter {
	
	public WordCounter(){
		countList = new HashMap<>();
	}
	
	public HashMap<String, Integer> countList;

	public HashMap<String, Integer> countWords(AlgoliaSerachResult searchResult) {
		searchResult.getHits().forEach(result -> countSentence(result.getTitle()));
		return countList;
	}

	private void countSentence(String title) {
		for(String word:title.split(" ")){
			countList.put(word, countList.getOrDefault(word, 0) + 1);
		}
	}

	public WordCount getResult(Integer resultSize, String searchTerm) {
		List<String> words = countList.entrySet().stream()
			.sorted((entry1, entry2)-> entry2.getValue().compareTo(entry1.getValue()))
			.limit(resultSize)
			.map(entry -> entry.getKey())
			.collect(Collectors.toList());
		return new WordCount(searchTerm, words);
	}
}
