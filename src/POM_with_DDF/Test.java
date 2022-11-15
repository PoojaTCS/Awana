package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) throws Throwable {
		//fetch the date from excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\pooja gaurishankar p\\Documents\\atomation\\poojapatil.xlsx");
		//Navigate to sheet
		Sheet sh = WorkbookFactory.create(file).getSheet("pooja1");

		//set the properties
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		//object of fist class=login class
	String username=sh.getRow(1).getCell(1).getStringCellValue();
		Login1Page l1=new Login1Page(driver);
		l1.enterUN(username);
		
		String password=sh.getRow(1).getCell(2).getStringCellValue();
		l1.enterPWD(password);
		l1.clickLOGIN();
		//object of second class = home page
		String expText = sh.getRow(1).getCell(3).getStringCellValue();
		HomePage h=new HomePage(driver);
		h.verifytext(expText);
	
         
	}

}
