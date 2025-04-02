package com.TNS_01_04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage_TestCases {
	@Test

	void testValidData() {

		Assert.assertEquals(3, 3);
	}

	@Test
	void testInValidData() {

		Assert.assertEquals(5, 5);
	}

	@Test
	void testHeader() {

		Assert.assertEquals(6, 6);
	}

}
