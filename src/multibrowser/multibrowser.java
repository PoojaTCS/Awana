package multibrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser {
	WebDriver driver=null;
	@Parameters ("browserName")//annotation helps to open particular browser requirement
	@BeforeClass
	public void browseropen(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\pooja gaurishankar p\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}	
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
			
			
			
		}
        
        driver.get("https://www.facebook.com/");
}
	   @Test
	   public void login() {
		   Reporter.log("login completed");
	   }
	   @AfterClass
	   public void browserclose() {
		   Reporter.log("browser close");
	   }
}