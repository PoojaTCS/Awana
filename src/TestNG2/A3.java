package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A3 {
	@Test//it will act like main method and Test case
	//in java there is only one main method but here we have multiple @test annotation
	public void M7() {
		Reporter.log("Test case no 7",true);
	}
	@Test
	public void M8() {
		Reporter.log("Test case no 8",true);
	}
	@Test
     public void M9() {
    	 Reporter.log("Test case no 9",true);
     }




}
