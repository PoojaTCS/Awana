package movetoelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movethecursor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
//inspect the element where you want to move the cursor
WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
//create object of action class
Actions act=new Actions(driver);
act.moveToElement(target).perform();

	}

}
