package POM_without_DDF_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   @FindBy (xpath="//input[@id='username']")private WebElement UN;
   @FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
   @FindBy (xpath="//div[text()='Login ']")private WebElement LOGINBTN;
    
   public LoginPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   public void enterUN() {
	   UN.sendKeys("admin");
   }
   public void enterPWD() {
	   PWD.sendKeys("manager");
   }
   public void ClickLOGINBTN() {
	   LOGINBTN.click();
   }
  
	   
   }
   

