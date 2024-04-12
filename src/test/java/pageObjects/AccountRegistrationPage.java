package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage{
	
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//label[normalize-space()='Male']")WebElement genderRadioBtn;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName']")WebElement firstNameTxt;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName']")WebElement lastNameTxt;
	
	@FindBy(xpath = "//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_dtDateOfBirth_lstDays']")WebElement drpDay;
	
	@FindBy(xpath = "//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_dtDateOfBirth_lstMonths']")WebElement drpMonth;
	
	@FindBy(xpath = "//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_dtDateOfBirth_lstYears']")WebElement drpYear;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName']")WebElement email;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtCompany']")WebElement companyName;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtStreetAddress']")WebElement streetAddress1;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtStreetAddress2']")WebElement streetAddress2;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtZipPostalCode']")WebElement pinCode;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtCity']")WebElement city;
	
	@FindBy(xpath = "//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry']")WebElement country;
	
	@FindBy(xpath = "//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlStateProvince']")WebElement state;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtPhoneNumber']")WebElement telephone;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFaxNumber']")WebElement gstin;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password']")WebElement password;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword']")WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton']")WebElement btnRegister;
	
	@FindBy(xpath = "//div[@class='section-body']/p/span")WebElement msgConfirmation;
	
	
	
	public void clickRadioBtn() {
		genderRadioBtn.click();
	}
	
	public void setFirstName(String firstName) {
		firstNameTxt.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		lastNameTxt.sendKeys(lastName);
	}
	
	
	public void selectDay() {
		Select dropdownDay=new Select(drpDay);
		dropdownDay.selectByVisibleText("25");
//		List<WebElement> days=dropdownDay.getOptions();
//		System.out.println(days.size());
//		
//		for(WebElement day:days) {
//			System.out.println(day.getText());
//		}
	}
	
	
	public void selectMonth() {
		Select dropDownMonth=new Select(drpMonth);
		dropDownMonth.selectByVisibleText("09");
//		List<WebElement> months=dropDownMonth.getOptions();
//		System.out.println(months.size());
//		
//		for(WebElement month:months) {
//			System.out.println(month.getText());
//		}
	}
	
	
	public void selectYear() {
		Select dropDownYear=new Select(drpYear);
//		List<WebElement> years=dropDownYear.getOptions();
//		System.out.println(years.size());
//		
//		for(WebElement year:years) {
//			System.out.println(year.getText());
//		}
		
		dropDownYear.selectByVisibleText("1995");
	}
	
	public void setEmail(String emil) {
		email.sendKeys(emil);
	}
	
	public void setCompanyName(String companyname) {
		companyName.sendKeys(companyname);
	}
	
	public void setStreetAddress1(String streetaddress) {
		streetAddress1.sendKeys(streetaddress);
	}
	
	public void setStreetAddress2(String streetaddress2) {
		streetAddress2.sendKeys(streetaddress2);
	}
	
	public void setPincode(String picode) { 
		pinCode.sendKeys(picode);
	}
	
	public void setCity(String cty) {
		city.sendKeys(cty);
	}
	
	
	
	
	public void selectCountry() {
		Select dropDownCountry=new Select(country);
		dropDownCountry.selectByVisibleText("India");
//		List<WebElement> countrys=dropDownCountry.getOptions();
//		
//		System.out.println(countrys.size());
//		
//		for(WebElement contry:countrys) {
//			System.out.println(contry.getText());
//		}
		
		
	}
	
	Select dropDownState=new Select(state);
	public void selectState() {
		List<WebElement> states=dropDownState.getOptions();
		System.out.println(states.size());
		
		for(WebElement st:states) {
			System.out.println(st.getText());
		}
	}
	
	public void setTelephone(String telephne) {
		telephone.sendKeys(telephne);
	}
	
	public void setGst(String gst) {
		gstin.sendKeys(gst);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String confmPassword) {
		confirmPassword.sendKeys(confmPassword);
	}
	
	public void clickRegisterButton() {
		btnRegister.click();
	}
	
	public String getConfirmationMessage() {
		try {
			System.out.println(msgConfirmation.getText());
			return (msgConfirmation.getText());
		}catch(Exception e) {
			return (e.getMessage());	
		}
		
	}
	
	
	
}
