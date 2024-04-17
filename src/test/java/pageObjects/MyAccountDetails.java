package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountDetails extends BasePage {
	public MyAccountDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='My Account']")WebElement myAccountDetails;
	
	@FindBy(xpath="//span[@id='__tab_ctl00_ctl00_cph1_cph1_CustomerTabs_pnlCustomerAddresses']")WebElement customerAddressesDetails;
	
	@FindBy(xpath = "//span[@id='__tab_ctl00_ctl00_cph1_cph1_CustomerTabs_pnlCustomerOrders']")WebElement customerOrders;
	
	@FindBy(xpath="//span[@id='__tab_ctl00_ctl00_cph1_cph1_CustomerTabs_pnlChangePassword']")WebElement changePassword;
	
	@FindBy(xpath = "//div[normalize-space()='Your Personal Details']")WebElement personalDetailsHeading;
	
	@FindBy(xpath="//div[normalize-space()='Billing Address Book Entries']")WebElement billingAddress;
	
	@FindBy(xpath="//b[contains(text(),'Order Number:')]")WebElement orderNumber;
	
	@FindBy(xpath="//td[normalize-space()='Old Password:']")WebElement changePasswordDetails;
	
	public void clickMyAccountDetails() {
		myAccountDetails.click();
	}
	
	public void clickCustomerAddressesDetails() {
		customerAddressesDetails.click();
	}
	
	public void clickCustomerOrders() {
		customerOrders.click();
	}
	
	public void clickChangePassword() {
		changePassword.click();
	}
	
	public String checkPersonalDetails() {
		try {
			return (personalDetailsHeading.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	public String checkBillingAddress() {
		try {
			return (billingAddress.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	public boolean checkCustomerOrders() {
		try {
			return (orderNumber.isDisplayed());
		}catch(Exception e) {
			return (false);
		}
	}
	
	public boolean checkChangePassword() {
		try {
			return(changePassword.isDisplayed());
		}catch(Exception e) {
			return (false);
		}
	}
	
	
}
