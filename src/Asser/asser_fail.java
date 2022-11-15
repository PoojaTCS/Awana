package Asser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asser_fail {
	@Test
	public void TC1() {
		String act="pass";
		String exp="pass";
		Assert.fail();//it is used to fail the tc ...when the test case is failing always so in this case it will fail it by intension
	}

}
