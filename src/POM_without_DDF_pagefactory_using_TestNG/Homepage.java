package POM_without_DDF_pagefactory_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		
	
	public String verifyText() {//change method return type to string
		String actText = text.getText();
		return  actText;
	}

}//before class=to open the browser
//before method  =to open the application
//in testng we don`t use if else so we use Assert 
