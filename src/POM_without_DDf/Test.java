package POM_without_DDf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.actitime.com/login.do");
	//object 1st
	LoginPage l=new LoginPage(driver);
	l.enterUN();
	l.enterPWD();
	l.clickLoginBTN();
	//object 2nd
	HomePage h=new HomePage(driver);
	h.Verifytext();
}

}
