package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
   @Test
   public void pooja(){
	   Reporter.log("Running TC1",true);
	   
   }
   @Test
   public void yogesh() {
	   Reporter.log("Running TC2",true);
   }
   @Test
   public void ankush(){
	   Reporter.log("Running TC3",true);
   }
	  
   @Test
   public void sunita(){
	   Reporter.log("Running TC4",true);
   }
   @Test
   public void dhiraj(){
	   Reporter.log("Running TC5",true);
   }
   
   
}
