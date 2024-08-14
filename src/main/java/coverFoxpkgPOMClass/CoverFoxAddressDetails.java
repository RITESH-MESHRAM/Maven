package coverFoxpkgPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxAddressDetails {

	@FindBy(xpath = "//input[@placeholder='6 Digit Pincode']")
	private WebElement pincodefield;
	
	@FindBy(xpath="//div[@class='error-ui']")private WebElement pinfieldtext;
	
	@FindBy(xpath="//input[@placeholder='Your mobile number']")
	private WebElement numberfield;
	
	@FindBy(xpath="//div[@class='want-expert__error error-ui']") private WebElement numfieldtext;
	
	@FindBy(xpath="//div[text()='Continue']")
	private WebElement continuebtn;

	public CoverFoxAddressDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterpincode(String pincodevalue) {
		pincodefield.sendKeys(pincodevalue);
	}
	public void enternumber(String numbervalue) {
		numberfield.sendKeys(numbervalue);
	}
	
	public void contBtn() {
		Reporter.log("clicking on continue button", true);
		continuebtn.click();
	}
	
	public String pinfieldtexts() {
		String actualtext = pinfieldtext.getText();
		return actualtext;
	}
	
	public String numFieldTexts() {
		String actualtext = numfieldtext.getText();
		return actualtext;
	}
	

}
