package POM_without_DDf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration for POM class 
 @FindBy(xpath="//input[@id='username']")private WebElement UN;
 @FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
 @FindBy(xpath="//a[@id='loginButton']")private WebElement LoginBTN;
 //initialization
 public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
 }
 public void enterUN() {
	 UN.sendKeys("admin");
 }
 public void enterPWD() {
	 PWD.sendKeys("manager");
 }
 public void clickLoginBTN() {
	 LoginBTN.click();
		 
 }
 
	 
	
}
