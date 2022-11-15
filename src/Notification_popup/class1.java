package Notification_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class class1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
//	c.addArguments("start-maximized");
	
	
	WebDriver driver=new ChromeDriver(c);
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.get("https://www.hdfc.com/");
	
}
}
