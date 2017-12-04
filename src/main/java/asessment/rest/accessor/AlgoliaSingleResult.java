package asessment.rest.accessor;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlgoliaSingleResult {
	private String title;
	
	public AlgoliaSingleResult(){
		
	}

	public AlgoliaSingleResult(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
