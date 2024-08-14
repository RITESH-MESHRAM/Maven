package coverFoxpkgPOMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxresultpage {

	@FindBy(xpath="//div[contains(text(),'Health Insu')]") private WebElement results;
	
	@FindBy(className="plan-card-container")private List<WebElement> banners;
	@FindBy(xpath="//div[@class='f-select']")private WebElement sortdropdown;
	
	public CoverFoxresultpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//50 results are showing
	public int Resultbanners() {
		String[] ar = results.getText().split(" ");
		int result = Integer.parseInt(ar[0]);
		System.out.println(result);
		return result;
	}
	
		public int getPlanNumbersFromBanners()
		{
		int bannerSize = banners.size();
		return bannerSize;
		}
		
		
		public boolean sortdropdownisdiplayed() {
			boolean sort = sortdropdown.isDisplayed();
			return sort;
		}

	}
	
	


