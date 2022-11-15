package POM_without_DDF_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		//object of first class
		LoginPage l=new LoginPage(driver);
		l.enterUN();
		l.enterPWD();
		l.ClickLOGINBTN();
		//object of second class
		HomePage h=new HomePage(driver);
		h.Verifytext();
	}

}
