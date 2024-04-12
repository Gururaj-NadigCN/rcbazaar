package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName']")WebElement email;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password']")WebElement password;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_LoginButton']")WebElement btnLogin;
	
	
	
	public void setEmail(String emal) {
		email.sendKeys(emal);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	
	
	
}
