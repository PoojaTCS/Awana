package Screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Class1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//how to take screenshot
		//convert webdriver object to take screenshort
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call getscreenshot method
		File src =ts.getScreenshotAs(OutputType.FILE);
		//create object of file 
		File dest=new File("C:\\Users\\pooja gaurishankar p\\Desktop\\09 july screenshort\\amazon.jpg");
		Files.copy(src, dest);
	}

}
