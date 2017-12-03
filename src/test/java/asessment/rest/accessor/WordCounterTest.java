package asessment.rest.accessor;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import asessment.WordCounter;
import asessment.rest.accessor.AlgoliaSerachResult;
import asessment.rest.accessor.AlgoliaSingleResult;

public class WordCounterTest {

	@Test
	public void testCountWords() {
		AlgoliaSerachResult asr = new AlgoliaSerachResult();
		asr.setHits(Arrays.asList(new AlgoliaSingleResult("Test word count easy"), new AlgoliaSingleResult("Test word count"), new AlgoliaSingleResult("Test word"), new AlgoliaSingleResult("Test")));
		WordCounter testee = new  WordCounter();
		assertEquals(testee.countWords(asr).get("Test"), Integer.valueOf(4));
	}
	
	@Test
	public void testGetResult() {
		AlgoliaSerachResult asr = new AlgoliaSerachResult();
		asr.setHits(Arrays.asList(new AlgoliaSingleResult("Test word count easy"), new AlgoliaSingleResult("Test word count"), new AlgoliaSingleResult("Test word"), new AlgoliaSingleResult("Test")));
		WordCounter testee = new  WordCounter();
		testee.countWords(asr);
		assertEquals("count", testee.getResult(3, "pudding").getWords().get(2));
	}
}
