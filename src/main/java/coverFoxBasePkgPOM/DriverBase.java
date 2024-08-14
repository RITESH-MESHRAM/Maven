package coverFoxBasePkgPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import coverFoxUtilityPOM.UtilityCF;

public class DriverBase {

	public static WebDriver driver;
	
	public static void LaunchBrowser() {
//		ChromeOptions ch = new ChromeOptions();
//		ch.addArguments("--disable-notifications");
		
		//ChromeOptions ch = UtilityCF.ChromeOptionsMethods();
		driver =new ChromeDriver(UtilityCF.ChromeOptionsMethods());
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	
	
	
	
	
	
	
}
