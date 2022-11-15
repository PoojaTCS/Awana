package max_min_browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args)throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//maximize
		driver.manage().window().maximize();
		//minimize
		Thread.sleep(4000);
		//driver.manage().window().minimize();
		//Thread.sleep(4000);
		//setsize()
 // Dimension d= new Dimension(100, 200);	
 // Thread.sleep(4000);
	//	driver.manage().window().setSize(d);
		//Thread.sleep(4000);
		 //setposition
		Point p=new Point(100, 400);
	 driver.manage().window().setPosition(p);
	}

}
