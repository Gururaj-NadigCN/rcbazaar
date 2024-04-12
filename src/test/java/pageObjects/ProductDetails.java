package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends BasePage {
	
	public ProductDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlHomePageProducts_dlProducts_ctl00_ctrlProductBox_RPProPrice_ctl00_btnProductDetails']")WebElement btnDetails;
	
	public void clickBtnProductDetails() {
		btnDetails.click();
	}
	
	@FindBy(xpath = "//div[@class='fulldescription']")WebElement fullDetails;
	
	public boolean isDetailsExists() {
		try {
			return fullDetails.isDisplayed();	
		}catch(Exception e) {
			return (false);
		}
		
	}
	
}
