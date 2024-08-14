package coverFoxpkgPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPOMClass {
	
	
	
	@FindBy(xpath="//input[@id='email']")private WebElement numberfield;
	
	@FindBy(xpath="//input[@id='pass']")private WebElement passfield;
	
	public FBPOMClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enternumber(String number) {
		numberfield.sendKeys(number);
	}
	public void enterpass(String password) {
		passfield.sendKeys(password);
	}
	
	
	
	
	
	
	
	

}
