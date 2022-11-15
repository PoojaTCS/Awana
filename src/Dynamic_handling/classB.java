package Dynamic_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classB {//amazon
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 20000",Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> id =driver.getWindowHandles();
		Iterator<String> itr=id.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		
		
		//String sc = driver.findElement(By.xpath("((//div[@class='centerColAlign centerColAlign-bbcxoverride'])[1]/descendant::span[@class='a-size-base'])[1]")).getText();
		//System.out.println(sc);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
		
	}

}
