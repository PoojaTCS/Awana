package Asser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_equalse {
	@Test
	public void TC1() {
		String actR="pooja";
		String expR="pooja";
	Assert.assertEquals(actR, expR);//if the condition is equals then the output is true
	}

}
/* Assert disadvantage==
 * if one of the testcase contains multiple verification if one verification fails then entire remaining 
 * >>verification will fail to avoid this we have soft assert(verification)
 * >>assert class have=static methods
 * >>soft assert have=non static method so we need to create object of soft assert
 * 
 */ 
	