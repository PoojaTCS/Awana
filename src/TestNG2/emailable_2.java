package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_2 {
	@Test //it will act like main method and Test case
	//in java there is only one main method but here we have many @test annotation
	
     public void m1() {
		Reporter.log("Test case no1",true);
	}
	@Test
	public void m2() {
		Reporter.log("Test case no2",true);
	}
	@Test
	public void m3() {
		Reporter.log("Test case no3",true);
	}
}
