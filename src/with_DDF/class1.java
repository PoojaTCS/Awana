package with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		FileInputStream file=new FileInputStream ("C:\\Users\\pooja gaurishankar p\\Documents\\atomation\\poojapatil.xlsx");
		int row=WorkbookFactory.create(file).getSheet("pooja1").getLastRowNum(); //4
		int cell=3;
				for(int i=1;i<row;i++) {
			for(int j=1;j<cell;j++) {	
				FileInputStream fis=new FileInputStream ("C:\\Users\\pooja gaurishankar p\\Documents\\atomation\\poojapatil.xlsx");
				if(j==1) {
					
					String username=WorkbookFactory.create(fis).getSheet("pooja1").getRow(i).getCell(j).getStringCellValue();
					driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
					
				}
				if(j==2)
				{ String password=WorkbookFactory.create(fis).getSheet("pooja1").getRow(i).getCell(j).getStringCellValue();
					driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
				}
		}	
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			Thread.sleep(9000);
			String Acttitle="actiTIME - Enter Time-Track";
			String Exptitle=driver.getTitle();	
			if(Acttitle.equals(Exptitle)) {
				System.out.println("Test case is pass");
			}
			else {
				System.out.println("Test CAse FAil");
			}
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(9000);
			
			
				
			
		}		
		
	}

	}


