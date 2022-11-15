package Alert_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/delete_customer.php");
     driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456",Keys.ENTER);
     
	}

}
