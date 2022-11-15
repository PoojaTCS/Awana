package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tryel {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
