package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classA {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pooja%20gaurishankar%20p/Documents/atomation/project/WebTable%20by%20ANKUSH%20(1).html");
		//print only student name
		String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
		System.out.println(sn);
		//print city
		String city = driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
		System.out.println(city);
		//print sr no
		String sr = driver.findElement(By.xpath("//table[@id='2244']//th[1]")).getText();
		System.out.println(sr);
		//print first name
		String sachin = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
		System.out.println(sachin);
		
		
	
		
	}

}
