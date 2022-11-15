package parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class par_execution_3 {
	@Test
	public void Tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\pooja gaurishankar p\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

}
