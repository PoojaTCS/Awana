package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classA {
	@Test
	public void TC() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\pooja gaurishankar p\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("");
	}

}
