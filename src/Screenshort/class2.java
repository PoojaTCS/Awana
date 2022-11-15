package Screenshort;



import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class class2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\pooja gaurishankar p\\Desktop\\09 july screenshort\\facebook.jpg");
		Files.copy(src, dest);
	}

}
