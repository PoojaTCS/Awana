package Asser;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hardassert {
	@Test
	public void TC1() {
		Reporter.log("Running TC1");
		String exp="hlo";
		String act="hlo";
		//Assert.assertEquals(exp, act,"test is failed");
		//Assert.assertNotEquals(act, exp,"test is passed");
		//Assert.fail();
		//Reporter.log("test is failed",true);
		boolean result=true;
		Assert.assertTrue(result);
		boolean test=false;
		Assert.assertFalse(test);
	}

}
