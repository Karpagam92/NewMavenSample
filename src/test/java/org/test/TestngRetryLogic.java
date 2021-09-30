package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngRetryLogic {
	
	@Test

	public void tc0() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void tc1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void tc2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void tc3() {
		Assert.assertTrue(true);
	}
}
