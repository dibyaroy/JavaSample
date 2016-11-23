package seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadNotUsingTestNG {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("./Source/Credentials.xlsx"));
		
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		
		XSSFSheet mySheet = myWorkbook.getSheetAt(0);
		
		int rowCount = mySheet.getLastRowNum();
		
		System.out.println(rowCount);
		
		fis.close();

	}

}
