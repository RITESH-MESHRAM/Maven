package listenerStudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import coverFoxUtilityPOM.UtilityCF;

public class Listener implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("TC " +result.getName()+" execution started", true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC "+result.getName()+" completed successfully ",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC "+result.getName()+" failed", true);
		WebDriver driver = null;
		try {
			UtilityCF.Screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC " +result.getName()+" is skipped", true);
		}
	
}
