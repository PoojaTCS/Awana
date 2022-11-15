package nevigates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_2 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();

		
	}

}
