package keywords_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_count {
	@Test(invocationCount=10)
	public void M1() {
		Reporter.log("Test case NO1",true);
	}

}
