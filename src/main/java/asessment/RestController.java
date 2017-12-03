package asessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asessment.rest.accessor.AlgoliaServiceAccessor;

@RestController
@RequestMapping("/words/{searchTerm}/")
class BookmarkRestController {

	private AlgoliaServiceAccessor algoliaServiceAccessor;

	@Autowired
	BookmarkRestController() {

	}

	@RequestMapping(method = RequestMethod.GET)
	WordCount returnWordcount(@PathVariable String searchTerm) {
		algoliaServiceAccessor.getFirstPage(searchTerm);
		return null;
		
	}
}