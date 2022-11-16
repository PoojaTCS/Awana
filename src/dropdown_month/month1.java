package dropdown_month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class month1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//now select on create new account button
		driver.findElement(By.xpath("//a[@id='u_0_0_w7']")).click();
		//select the dropdown of month
		Thread.sleep(4000);
	WebElement	month=driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	Thread.sleep(4000);
	s.selectByVisibleText("march");
		System.out.println("Hello pooja");
	

	}

}
