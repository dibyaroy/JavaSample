package seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ExcelRead {
  @Test(dataProvider = "dp")
  public void f(String username, String passWord) {
	  System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.ultimatix.net/");
	  driver.findElement(By.id("USER")).sendKeys(username);
	  driver.findElement(By.id("PASSWORD")).sendKeys(passWord);
	  
  }

  @DataProvider
  public String[][] dp() throws IOException {
    FileInputStream fis = new FileInputStream(new File("C:\\Users\\Dibya\\workspace\\JavaSample\\Source\\Credentials.xlsx"));
    XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
    XSSFSheet mySheet = myWorkbook.getSheetAt(0);
    
    int rowCount = mySheet.getLastRowNum();
    
    int columnCount = mySheet.getRow(0).getLastCellNum();
    
    String[][] myObj = new String[rowCount][columnCount];
    for (int i=0;i<rowCount;i++)
    {
    	for(int j=0;j<columnCount;j++)
    	{
    		myObj[i][j]=mySheet.getRow(i+1).getCell(j).getStringCellValue();
    	}
    }
   return myObj;
    }
  }

