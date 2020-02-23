package com.bit.test;

import org.junit.Ignore;
import org.junit.Test;

public class SmokeTest extends BaseTest {
	@Test
	public void testCase1_bittechusa() {
		dr.get(prop.getProperty("url_bittech"));
		
		
	}
	@Ignore
	@Test
	public void testCase2_eshopper() {
		
		
	}

}
