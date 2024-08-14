package coverFoxpkgPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage  {
	
	@FindBy(xpath="//div[text()='Male']")private  WebElement malebutton;
	
	
	
	
	public CoverFoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickmalebtn() {
		malebutton.click();
	}
	
	

}
