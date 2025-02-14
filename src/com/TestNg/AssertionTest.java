package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	@Test
	public void testAssertion()
	{
		int Actual=5;
		int Expected=6;
		Assert.assertEquals(Actual, Expected, "both are equal");
		Assert.assertTrue(Actual>2, "condition is true");
		Assert.assertFalse(Actual<4, "conditionshould be true");
		
		Assert.assertNotNull(Actual, "object is not null");
	}

	
	
	
	
	
}
