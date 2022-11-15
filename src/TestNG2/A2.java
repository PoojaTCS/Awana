package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A2 {
	@Test//it will act like main method and Test case
	//in java there is only one main method but here we have multiple @test annotation
	public void M4() {
		Reporter.log("Test case no 4",true);
	}
	@Test
	public void M5() {
		Reporter.log("Test case no 5",true);
	}
	@Test
     public void M6() {
    	 Reporter.log("Test case no 6",true);
     }




}
