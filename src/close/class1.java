package close;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja gaurishankar p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
     Dimension d=new Dimension(100,200);//setsize
     driver.manage().window().setSize(d);
    
   driver.get("https://www.amazon.in/");
    System.out.println("program done");
    driver.close();
    Point p= new Point(100,300);
    driver.manage().window().setPosition(p);//setposition
    
    String link=driver.getCurrentUrl();
    System.out.println(link);//current link
    
    String page=driver.getPageSource();
    System.out.println(page);//pagesource
    String title=driver.getTitle();
    System.out.println(title);
  driver.findElement(By.id("email")).sendKeys("pooja");//webelement
 
    
    
    
}
}