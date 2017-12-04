package asessment;

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asessment.rest.accessor.AlgoliaSerachResult;
import asessment.rest.accessor.AlgoliaServiceAccessor;

@RestController
@RequestMapping("/words/{searchTerm}/{resultSize}")
class BookmarkRestController {

	
	private AlgoliaServiceAccessor algoliaServiceAccessor;

	@Autowired
	BookmarkRestController(AlgoliaServiceAccessor algoliaServiceAccessor) {
		this.algoliaServiceAccessor = algoliaServiceAccessor;
	}

	@RequestMapping(method = RequestMethod.GET)
	WordCount returnWordcount(@PathVariable String searchTerm, @PathVariable Integer resultSize) {
		AlgoliaSerachResult searchResult = algoliaServiceAccessor.getFirstPage(searchTerm);
		WordCounter wc = new WordCounter();
		wc.countWords(searchResult);
		return wc.getResult(resultSize, searchTerm);
	}
}