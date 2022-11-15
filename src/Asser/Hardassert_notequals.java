package Asser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert_notequals {
	@Test
	public void notequals() {
		String exp="pooja";
		String act="poo";//Pass
		Assert.assertNotEquals(act,exp);//both should be not equal then the TC will pass
		//both are equal then it will fail
	}

}
