package Asser;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
     @Test
     public void TC1() {
    	 SoftAssert asr=new SoftAssert();
    	 String act="hi";
    	 String exp="hi";
    	 asr.assertEquals(act, exp);
    	 asr.assertNotEquals(act, exp);
    	 asr.fail();
    	 boolean result=true;
    	 boolean test=false;
    	 asr.assertTrue(result);
    	 asr.assertFalse(test);
    	 Reporter.log("test is completed",true);
    	 asr.assertAll();
     }
}
