package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='boxtitle']")
	WebElement loginHeading;

	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement btnLogout;
	
	//product details displayed
	@FindBy(xpath="//span[normalize-space()='Shipped from INDIA']")WebElement productDetails;
	
	public boolean isProductDetailsDisplayed() {
		try {
			return productDetails.isDisplayed();
		}catch(Exception e) {
			return(false);
		}
	}
	
	
	
	public boolean isHeadingExists() {
		try {
			return loginHeading.isDisplayed();	
		}catch(Exception e) {
			return (false);
		}
		
	}
	
	public void clickLogout() {
		btnLogout.click();
	}
}
