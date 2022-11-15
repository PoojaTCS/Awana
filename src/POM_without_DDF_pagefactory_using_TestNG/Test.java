package POM_without_DDF_pagefactory_using_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM_with_DDF.HomePage;

public class Test {
	Sheet sh;
	WebDriver driver;
	Homepage hp;
	Login_1 lg;
	
     @BeforeClass//used to open the browser
     public void openbro() throws Throwable {
    	 FileInputStream fis=new FileInputStream("C:\\\\Users\\\\pooja gaurishankar p\\\\Documents\\\\atomation\\\\poojapatil.xlsx");
    	 WorkbookFactory.create(fis).getSheet("pooja1");
    	 System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Users\\\\\\\\pooja gaurishankar p\\\\\\\\Downloads\\\\\\\\geckodriver-v0.31.0-win64\\\\\\\\geckodriver.exe");
    	driver= new FirefoxDriver();
    	 driver.get("https://demo.actitime.com/login.do");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 //all objects
    	 lg=new Login_1(driver);
    	 hp=new Homepage(driver);
    	 
    	 
     }
     @BeforeMethod
     public void openApp() {
    	 //enter UN
    	 String username=sh.getRow(1).getCell(1).getStringCellValue();
    	 lg.enterUN(username);
    	 //enter password
    	 String password=sh.getRow(1).getCell(2).getStringCellValue();
    	 lg.enterPWD(password);
    	 //click on login
    	 lg.clickLOGINBTN();
    	 
    	 
    	 
     }
     @org.testng.annotations.Test
     public void verifyText() {
    	 Reporter.log("running verifyText",true);
    	 String expText = sh.getRow(1).getCell(3).getStringCellValue();
    	 String actText = hp.verifyText();
    	 Assert.assertEquals(expText, actText,"Failed both are diffrent");
 		
     }
     @AfterMethod
     public void closeApp() {
    	 Reporter.log("logout from app",true);
    	 
     }
     @AfterClass
     public void closebro() {
    	 Reporter.log("logout from browser",true);
     }
     
     
}
