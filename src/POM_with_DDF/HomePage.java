package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="//td[text()='Enter Time-Track']")private WebElement text;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void verifytext(String expText) {
			String actText = text.getText();
			if(actText.equals(expText)) {
				System.out.println("TC is pass");
				
			
		
	}
			else {
				System.out.println("TC is fail");
			}
	 
} 

}
