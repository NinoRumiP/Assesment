package asessment;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import asessment.rest.accessor.AlgoliaSerachResult;

public class WordCounter {
	
	public WordCounter(){
		countList = new HashMap<>();
	}
	
	HashMap<String, Count> countList;

	public void countWords(AlgoliaSerachResult searchResult) {
		searchResult.getHits().forEach(result -> countSentence(result.getTitle()));
	}

	private void countSentence(String title) {
		title = title.replaceAll("\\p{P}", "");
		for(String word:title.split(" ")){
			countList.computeIfAbsent(word, (k -> new Count())).increase();
		}
	}

	public WordCount getResult(Integer resultSize, String searchTerm) {
		List<String> words = countList.entrySet().stream()
			.filter(entry -> !entry.getKey().equalsIgnoreCase(searchTerm))
			.sorted((entry1, entry2)-> entry2.getValue().getCount() - entry1.getValue().getCount())
			.limit(resultSize)
			.map(entry -> entry.getKey())
			.collect(Collectors.toList());
		return new WordCount(searchTerm, words);
	}
}
