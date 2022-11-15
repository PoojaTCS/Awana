package para;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class classA {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\pooja gaurishankar p\\OneDrive\\Documents\\book123.xlsx");
	String value = WorkbookFactory.create(fis).getSheet("new1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(value);
		FileInputStream fi=new FileInputStream("C:\\Users\\pooja gaurishankar p\\OneDrive\\Documents\\book123.xlsx");
    double ss = WorkbookFactory.create(fi).getSheet("new1").getRow(1).getCell(1).getNumericCellValue();
	   System.out.println(ss);
	}
	

}
