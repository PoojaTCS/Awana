package keywords_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependson_methods {
	@Test(timeOut=5000)
	public void login1() {
		Reporter.log("Test case no 4",true);
	}
	@Test
	public void login2() {
		Assert.fail();
		Reporter.log("Test case no 5",true);
	}
	@Test(dependsOnMethods= {"login1","login2"})
     public void logout() {
    	 Reporter.log("Test case no 6",true);
     }

}
