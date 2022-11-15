package batch_testng_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
	@Test
	public void A() {
		Reporter.log("Test case NO1",true);
	}
	@Test
	public void A2() {
		Reporter.log("Test case NO2",true);
	
	}
	@Test
	public void A3() {
		Reporter.log("Test case No3",true);
	}
	

}
