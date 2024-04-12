package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{
	
	public LogOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Log out']")WebElement logoutLink;
	
	@FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")WebElement headingAfterLogout;
	
	public void logoutLink() {
		logoutLink.click();
	}
	
	public boolean checkHeadingAfterLogout() {
		try {
			return(headingAfterLogout.isDisplayed());
		}catch(Exception e) {
			return(false);
		}
		
	}
}
