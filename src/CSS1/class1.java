package CSS1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean username =driver.findElement(By.cssSelector("input[id='username']")).isEnabled();
		System.out.println(username);
		driver.findElement(By.cssSelector("input[id='username']")).clear();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		Thread.sleep(3000);
		//set password
		boolean password=driver.findElement(By.cssSelector("input[name='pwd']")).isEnabled();
		System.out.println(password);
		driver.findElement(By.cssSelector("input[name='pwd']")).clear();
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		//String s=driver.findElement(By.xpath("//td[text()='Please identify yourself']")).getText();
		//System.out.println(s);
		  driver.findElement(By.xpath("//div[text()='Login ']")).click();
		  String s=driver.findElement(By.xpath("//td[text()='Please identify yourself']")).getText();
			System.out.println(s);
		  
		  
	}

}
