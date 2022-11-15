package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.flipkart.com/");
	//hidden division popup
//	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9113086069",Keys.TAB,"12345@p",Keys.ENTER);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//Alert popups
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456",Keys.ENTER);
Alert 	alt=driver.switchTo().alert();
String pp=alt.getText();
System.out.println(pp);
Thread.sleep(3000);
alt.accept();
	//driver.switchTo().alert().getText();
//	driver.switchTo().alert().accept();
	//driver.switchTo().alert().accept();
	
}
}
