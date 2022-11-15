package parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class par_execution {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\pooja gaurishankar p\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
	}

}
