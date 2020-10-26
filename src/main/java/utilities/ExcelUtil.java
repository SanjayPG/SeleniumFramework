package utilities;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ExcelUtil {
	
	static Sheet wrksheet;
	static Workbook wrkbook =null;
	static Hashtable<String,Integer> dict= new Hashtable<>();
	
	//Create a Constructor
	public ExcelUtil(String ExcelSheetPath) throws BiffException, IOException
	{
		//Initialize
		wrkbook = Workbook.getWorkbook(new File(ExcelSheetPath));
		//For Demo purpose the excel sheet path is hardcoded, but not recommended :)
		wrksheet = wrkbook.getSheet("LoginDetails");
		
		//Call colum dictionary so that it is initiated with constructor and need not be called separately
		ColumnDictionary();
	}

	//Returns the Number of Rows
	public static int RowCount()
	{
		return wrksheet.getRows();
	}

	//Returns the Cell value by taking row and Column values as argument
	private static String ReadCell(int column,int row)
	{
		return wrksheet.getCell(column,row).getContents();
	}
	
	public static String ReadCell(String colName,int rowNumber)
	{	
		String cellValue = null;
		cellValue = ReadCell(GetCell(colName),rowNumber);
		return cellValue;		
	}

	//Create Column Dictionary to hold all the Column Names
	private static void ColumnDictionary()
	{
		//Iterate through all the columns in the Excel sheet and store the value in Hashtable
		for(int col=0;col < wrksheet.getColumns();col++)
		{
			dict.put(ReadCell(col,0), col);
		}
	}

	//Read Column Names
	private static int GetCell(String colName)
	{
		try {
			int value;
			value =  dict.get(colName).intValue();
			return value;
		} catch (NullPointerException e) {
			return (0);

		}
	}

}




//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class ReadDataTest {
//
//  //Global initialization of Variables
//  static ExcelSheetDriver xlsUtil;
//  WebDriver driver = new InternetExplorerDriver();
//
//  //Constructor to initialze Excel for Data source
//  public ReadDataTest() throws BiffException, IOException
//  {
//		//Let's assume we have only one Excel File which holds all Testcases. weird :) Just for Demo !!!
//	    xlsUtil = new ExcelSheetDriver("D:\\Data.xls");
//	    //Load the Excel Sheet Col in to Dictionary for Further use in our Test cases.
//	    xlsUtil.ColumnDictionary();
//  }
//
//  @BeforeTest
//  public void EnvironmentalSetup()
//  {
//	  driver.get("http://www.gmail.com");
//  }
//
//  @Test
//  /*
//   * Author : Karthik KK
//   * Description : To Perform login operation in Gmail
//   */
//  public void GmailLoginPage() throws InterruptedException {
//
//	  //Create a for loop.. for iterate through our Excel sheet for all the test cases.
//	  for(int rowCnt = 1;rowCnt < xlsUtil.RowCount();rowCnt++)
//	  {
//
//		  //Enter User Name by reading data from Excel
//		  WebElement userName = driver.findElement(By.name("Email"));
//		  userName.clear();
//		  userName.sendKeys(xlsUtil.ReadCell(xlsUtil.GetCell("EmailUserName"), rowCnt));
//
//		  //Enter Password
//		  WebElement password = driver.findElement(By.name("Passwd"));
//		  password.clear();
//		  password.sendKeys(xlsUtil.ReadCell(xlsUtil.GetCell("Emailpassword"), rowCnt));
//
//		  //Click on the Sign In Button
//		  WebElement signin = driver.findElement(By.name("signIn"));
//		  signin.click();
//
//		  //Sleep for some time,so that we can see things in action @ Screen :)
//		  Thread.sleep(2000);
//	  }
//  }

//}
