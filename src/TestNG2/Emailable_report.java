package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_report {
	@Test//it will act like main method and Test case
	//in java there is only one main method but here we have multiple @test annotation
	public void M1() {
		Reporter.log("Test case no 1",true);
	}
	@Test
	public void M2() {
		Reporter.log("Test case no 2",true);
	}
	@Test
     public void M3() {
    	 Reporter.log("Test case no 3",true);
     }



}
