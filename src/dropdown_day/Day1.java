package dropdown_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 
		//select date which we want to handle
	Thread.sleep(4000);
  WebElement day	=driver.findElement(By.xpath("//select[@id='day']"));
          Select s=new Select(day);
          Thread.sleep(4000);
          //use select class methods (select by text)
          s.selectByVisibleText("26");
          
		
	}

}
