package facebook_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_script {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");//chromepath
		WebDriver driver=new FirefoxDriver();//tu eta webdriver driver=new chromedriver tak
		driver.get("https://demo.actitime.com/login.do");//eta tu facebook cha path ghal
		driver.manage().window().maximize();//page maximize hoil
		FileInputStream fis=new FileInputStream ("C:\\Users\\pooja gaurishankar p\\OneDrive\\Documents\\facebooksheet1.xlsx");//eta excel cha path
		int row=2;
		int cell=2;
				for(int i=1;i<row;i++) {
			for(int j=0;j<cell;j++) {	
	FileInputStream file=new FileInputStream ("C:\\Users\\pooja gaurishankar p\\OneDrive\\Documents\\facebooksheet1.xlsx");//eta pan excel cha path
				if(j==0) {
					
					String username=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
					driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);//username cha xpath
					
				}
				if(j==1)
				{ String password=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
					driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);//passwordcha expath
				}
		}	
			driver.findElement(By.xpath("//div[text()='Login ']")).click();//eta logincha expath
			
		
		
	}
		
		
	}}


