package com.djimenez;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class SpellingTest {

	private static final String FILE = "/Users/david/workspace/test/src/main/resources/big.txt";
	private Spelling spelling;

	public SpellingTest() throws IOException {
		
		 spelling = new Spelling(FILE);
	}
	
	@Test
	public void test() {
		assertEquals("together", spelling.correct("togehter"));
		assertEquals("operator", spelling.correct("opertor"));
		assertEquals("ideally", spelling.correct("ideally"));
	}

}
