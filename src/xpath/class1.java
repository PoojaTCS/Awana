package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter username(use formula of xpath by attribute
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//enter password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click on login button (use formula xpath by test())
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	

}
}