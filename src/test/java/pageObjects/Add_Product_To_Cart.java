package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Add_Product_To_Cart extends BasePage{
	
	public Add_Product_To_Cart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlHomePageProducts_dlProducts_ctl00_ctrlProductBox_RPProPrice_ctl00_imgbtnAddToCart']")WebElement buyButton;
	
	@FindBy(xpath="//select[@id='ctl00_ctl00_cph1_cph1_ctl00_ctrlProductVariantsInGrid_rptVariants_ctl00_ctrlProductPrice_RPProPrice_ctl01_ddlQuantity']")WebElement selectQuantity;
	
	@FindBy(xpath = "//input[@value='Add to cart']")WebElement addCartButton;
	
	@FindBy(xpath="//a[normalize-space()='1 Items Shopping cart']")WebElement shoppingItemsLink;
	
	@FindBy(xpath = "//h1[normalize-space()='Shopping cart']")WebElement shopingCartHaading;
	
	
	public void clickBuyButton() {
		buyButton.click();
	}
	
	public void selectingQuantity() {
		Select quantity=new Select(selectQuantity);
		quantity.selectByVisibleText("3");
		
	}
	
	public void clickAddCartButton() throws InterruptedException  {
		addCartButton.click();
		
		Thread.sleep(5000);	
	}
	
	
	public void clickShoppingItemLink() {
		shoppingItemsLink.click();
	}
	
	public boolean verifyShoppingCartHeading() {
		try {
			return shopingCartHaading.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
}
