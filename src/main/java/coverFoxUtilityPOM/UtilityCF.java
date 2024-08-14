package coverFoxUtilityPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class UtilityCF {
public static 	WebDriver driver;

	public void ReadExcelDataTestNG(String sheetname, int rownum, int cellnum)
			throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream(
				"C:\\Users\\admin\\eclipse-workspace\\Selenium_Project\\EXCELPractice.xlsx");

		WorkbookFactory.create(myfile).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();

		// Sheet mysheet = WorkbookFactory.create(myfile).getSheet(sheetname);
//	mysheet
//	
//	
//	int rowcount = myrow.getRowNum()-1;
//	System.out.println(rowcount);
//	Cell mycell = myrow.getCell(cellnum);
//	CellType Celltype1 = mycell.getCellType();

	}

	public static ChromeOptions ChromeOptionsMethods() {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		return ch;

	}

	public static void Screenshot(WebDriver driver) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
		String path=System.getProperty("user.dir")+"\\ScreenshotsTestNG"+"\\CoverFox" +random+".png";
		Reporter.log("taking screenshot", true);
		System.out.println(path);
		File destn = new File(path);
				
	//"C:\\Users\\admin\\eclipse\\java-2024-03\\eclipse\\ScreenshotEclipse\\CoverFox" +random+ ".png";

		FileHandler.copy(src, destn);
		}
		
		public static void PageScrolling(int Xaxis,int Yaxis) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+Xaxis+","+Yaxis+")");
		}
		
		public  static String propertiesfile(String key) throws IOException {
			Properties prop=new Properties();
			FileInputStream mypropfile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\CoverFoxTest\\FbLOGIN.properties");
			prop.load(mypropfile);
		String value = prop.getProperty(key);
			return value;
		}
		
		
		public static String PropertiesData(String key) throws IOException {
			
			FileInputStream myfile= new FileInputStream(System.getProperty("user.dir")+"\\FBLOGIN.properties");
		
			Properties prop=new Properties();
			prop.load(myfile);
			System.out.println("getting value from properties file"+key);

			String value = prop.getProperty(key);
			return value;
			
		}
			
			
			//C:\Users\HP\eclipse-workspace\CoverFoxTest\FBLOGIN.properties
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		

	

}
