package asessment;

import java.util.List;

public class WordCount {
	private String searchTerm;
	private List<String> words;
	
	public WordCount(String searchTerm, List<String> words) {
		this.searchTerm = searchTerm;
		this.words = words;
	}
	public String getSearchTerm() {
		return searchTerm;
	}
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}
}
