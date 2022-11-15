package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
   String  dd = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.firefox']")).getText();
	System.out.println(dd);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
String	vv=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.devtools.idealized.log']")).getText();
System.out.println(vv);
	}

}
