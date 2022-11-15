package Scroll_Handling;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.amazon.in/");
		//typecast
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		jse.executeScript("window.scroll(0,2000)");
		
	}

}
