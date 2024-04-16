package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotLinkFunctionality extends BasePage {
	
	public ForgotLinkFunctionality(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_hlForgotPassword']")WebElement forgotLink;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlPasswordRecovery_txtEmail_txtValue']")WebElement emailForgotLink;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlPasswordRecovery_btnPasswordRecovery']")WebElement btnRecover;
	
	@FindBy(xpath="//strong[normalize-space()='Email with instructions has been sent to you.']")WebElement emailSentVerification;
	
	public void enterForgtLinkEmail(String email) {
		emailForgotLink.sendKeys(email);
	}
	
	public void clickForgotLink() {
		forgotLink.click();
	}
	
	public void clickBtnRecover() {
		btnRecover.click();
	}
	
	public String checkConfirmation() {
		try {
			return (emailSentVerification.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}

}
