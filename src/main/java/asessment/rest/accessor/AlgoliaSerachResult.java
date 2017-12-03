package asessment.rest.accessor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlgoliaSerachResult {
	private List<AlgoliaSingleResult> hits;

	public List<AlgoliaSingleResult> getHits() {
		return hits;
	}

	public void setHits(List<AlgoliaSingleResult> hits) {
		this.hits = hits;
	}
}
