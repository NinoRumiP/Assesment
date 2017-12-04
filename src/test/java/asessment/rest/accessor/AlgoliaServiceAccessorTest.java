package asessment.rest.accessor;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AlgoliaServiceAccessorTest {

	@Ignore
	@Test
	public void learningTest() {
		AlgoliaServiceAccessor testee = new AlgoliaServiceAccessor();
		AlgoliaSerachResult result = testee.getFirstPage("apple");
		assertTrue(result.getHits().size() > 0);
	}
}
