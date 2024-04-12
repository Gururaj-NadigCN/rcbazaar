package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='shoppingCartLink']//div//button")WebElement registerButton;
	
	@FindBy(xpath = "//a[normalize-space()='Log in']")WebElement loginLink;
	
	//@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlHomePageProducts_dlProducts_ctl00_ctrlProductBox_RPProPrice_ctl00_btnProductDetails']")WebElement btnDetails;
	
	public void clickRegistrationButton() {
		registerButton.click();
	}
	
	public void clickLoginLink() {
		
		loginLink.click();
	}
	
//	public void clickDetailsButton() {
//		btnDetails.click();
//	}
	
	
}
