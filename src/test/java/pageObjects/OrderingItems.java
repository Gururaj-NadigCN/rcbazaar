package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderingItems extends BasePage{
	public OrderingItems(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_OrderSummaryControl_btnCheckout']")WebElement btnCheckOut;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCheckoutShippingAddress_dlShippingAddresses_ctl00_btnSelect']")WebElement btnShipAddress;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_Repeater1a_ctl00_rdbtnR1a']")WebElement radioSelectShipper;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_btnfinished']")WebElement btnProceedCheckOut;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_btnContinueShopping']")WebElement btnContinueShipping;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCheckoutBillingAddress_dlBillingAddresses_ctl00_btnSelect']")WebElement btnBillingAddress;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCheckoutPaymentMethod_RpPaymentMethod_ctl00_rbPaymentMethods_0']")WebElement selectPayment;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCheckoutPaymentMethod_cbTermsOfService']")WebElement chkTermsAndConditions;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCheckoutPaymentMethod_btnNextStep']")WebElement btnNext;
	
	@FindBy(xpath="//a[normalize-space()='2 Items Shopping cart']")WebElement shoppingLink;
	
	public void clickShopLink() {
		shoppingLink.click();
	}
	public void clickCheckOut() {
		btnCheckOut.click();
	}
	
	public void clickShipToAddress() {
		btnShipAddress.click();
	}
	
	public void clickSelectShipper() {
		radioSelectShipper.click();
	}
	
	public void clickProceedCheckOut() {
		btnProceedCheckOut.click();
	}
	
	public void clickContinueShipping() {
		btnContinueShipping.click();
	}
	
	public void clickOnBillingAddress() {
		btnBillingAddress.click();
	}
	
	public void clickPaymentMethod() {
		selectPayment.click();
	}
	
	public void clickTermsAndConditions() {
		chkTermsAndConditions.click();
	}
	
	public void clickBtnNext() {
		btnNext.click();
	}
	
	
	
}
