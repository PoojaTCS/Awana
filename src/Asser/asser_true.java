package Asser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asser_true {
	@Test
	public void TC1() {
		//boolean String=true;//if it is true then it will pass
		//Assert.assertTrue(String);//pass
		// boolean String=false;//if it is false then the TC will pass..
		boolean String =true;//in this case it will be fail
		// Assert.assertFalse(String);//fail
		 Assert.assertTrue(String);;//pass test will pass 
	}

}
