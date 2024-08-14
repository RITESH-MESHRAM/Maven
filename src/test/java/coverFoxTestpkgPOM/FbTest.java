package coverFoxTestpkgPOM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBasePkgPOM.DriverBase;
import coverFoxUtilityPOM.UtilityCF;

@Listeners(listenerStudy.Listener.class)
public class FbTest extends DriverBase {
			
	@BeforeMethod
	public void launchwepage() {
		DriverBase.LaunchBrowser();
	}
	
	
  @Test
  public void Fblogin() throws IOException, InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UtilityCF.propertiesfile("number"));
	  
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(UtilityCF.propertiesfile("password"));
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
