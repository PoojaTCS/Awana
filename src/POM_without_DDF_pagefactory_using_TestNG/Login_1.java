package POM_without_DDF_pagefactory_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_1 {
	//declaration
    @FindBy(xpath="//input[@id='username']")private WebElement UN;
    @FindBy(xpath="//input[@id='username']")private WebElement PWD;
    @FindBy(xpath="//a[@id='loginButton']")private WebElement LOGINBTN;
    
    public Login_1(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	
    }
    public void enterUN(String username) {
    	UN.sendKeys(username);
    }
    public void enterPWD(String password) {
    	PWD.sendKeys(password);
    }
    public void clickLOGINBTN() {
    	LOGINBTN.click();
    }
    
    
}
