package Dynamic_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classA {
  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		String sr = driver.findElement(By.xpath("(//div[@class='content-inner']/descendant::span)[1]")).getText();
		System.out.println(sr);
}
}
