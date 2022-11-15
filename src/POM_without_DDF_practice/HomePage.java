package POM_without_DDF_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
  public HomePage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  
  }
  public void Verifytext() {
	  String extText = "Enter Time-Track";
	  String actText = text.getText();
	  if(actText.equals(actText)) {
		  System.out.println("TC is pass");
		  
	  }
	  else {
		  System.out.println("Tc is fail");
	  }
  }

	  
  }

