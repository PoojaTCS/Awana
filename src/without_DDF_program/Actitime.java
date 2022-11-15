package without_DDF_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//delete all cookies
		driver.manage().deleteAllCookies();
		//maximize
		driver.manage().window().maximize();
		//open the application
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter password
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		//click on login btn
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//add something on log in page
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("Pooja");
		//actual title
		String title = driver.getTitle();
		System.out.println(title);
		//exp title
		String exp="actiTIME - Enter Time-Track";
		//compare both
		if(exp.equals(title)) {
			System.out.println("Tc is pass");
			
		}
		else {
			System.out.println("TC is fail");
		}
				
				
		
		
		
	}

}
