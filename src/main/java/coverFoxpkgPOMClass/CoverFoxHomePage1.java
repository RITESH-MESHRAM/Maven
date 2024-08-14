package coverFoxpkgPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage1 {
	
	@FindBy(xpath="//div[text()='Male']") private WebElement Mbutton;
	@FindBy(xpath="//h2[contains(text(),'Best')]") private WebElement text;

	public CoverFoxHomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMbutton() {
		Mbutton.click();
	}
//	public void texthomepage() {
//		
//		String textonHomePage = text.getText();
//		System.out.println(textonHomePage);
//	}

}
