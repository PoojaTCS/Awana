package facebook_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class excel_dataprint {
	public static void main(String[] args) throws Throwable {
		//count of row and cell from excel
		FileInputStream file=new FileInputStream("C:\\Users\\pooja gaurishankar p\\OneDrive\\Documents\\ExcelData1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("credentiols");
		int rownum=sheet.getLastRowNum() + 1;//it will count from 0 so we add 1 no
		System.out.println("Total number of Rows : "+rownum);
		XSSFRow row =sheet.getRow(0);
		int colnum=row.getFirstCellNum();
		System.out.println("Total number of coloums : "+colnum);
		
	}
	

}
