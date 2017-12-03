package asessment.rest.accessor;

import org.springframework.web.client.RestTemplate;

public class AlgoliaServiceAccessor {

	public AlgoliaSerachResult getFirstPage(String searchTerm) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("https://hn.algolia.com/api/v1/search?query=" + searchTerm, AlgoliaSerachResult.class);
	}

}
