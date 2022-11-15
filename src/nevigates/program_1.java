package nevigates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
	     
		Thread.sleep(4000);
		driver.navigate().forward();//now control goes to amazon
		Thread.sleep(3000);
		driver.navigate().refresh();//whenever page is refreshed in automation at that time address of webpage can be change
		driver.quit();
	}

}
