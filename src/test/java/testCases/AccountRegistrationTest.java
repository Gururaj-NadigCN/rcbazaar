package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {
			
	@Test(groups = {"regression","master"})
	public void verify_account_registration() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.clickRegistrationButton();
		
		logger.info("*****TC_001 Account_Registration*****");
		logger.debug("Application Started");
		logger.info("*****Application Started*****");
		logger.debug("application logs");
		
		try {
		AccountRegistrationPage registration=new AccountRegistrationPage(driver);
		logger.info("Entering First Name");
		registration.setFirstName(randomString().toUpperCase());
		logger.info("Entering Last Name");
		registration.setLastName(randomString().toUpperCase());
		logger.info("Selecting Day");
		registration.selectDay();
		logger.info("Selecting Month");
		registration.selectMonth();
		logger.info("Selecting Year");
		registration.selectYear();
		logger.info("Entering Email");
		registration.setEmail(randomString()+"@gmail.com");
		logger.info("Entering Company Name");
		registration.setCompanyName("abc");
		logger.info("Entering Street Address1");
		registration.setStreetAddress1("Bangalore");
		logger.info("Entering Street Address 2");
		registration.setStreetAddress2("BNG");
		logger.info("Entering Pincode");
		registration.setPincode("560050");
		logger.info("Entering City");
		registration.setCity("Bengaluru");
		logger.info("Selecting Country");
		registration.selectCountry();
		logger.info("Selecting State");
		registration.selectState();
		logger.info("Entering Phone Number");
		registration.setTelephone(randomNumber());
		logger.info("Entering GST Number");
		registration.setGst(randomNumber());
		String password=randomAlphaNumeric();
		logger.info("Entering Password");
		registration.setPassword(password);
		logger.info("Entering Confirm Password");
		registration.setConfirmPassword(password);
		logger.info("Clicking on Registration Button");
		registration.clickRegisterButton();
		
		//Thread.sleep(8000);
		String confMsg=registration.getConfirmationMessage();
		logger.info("Validating Confirmation Message");
		
		Assert.assertEquals(confMsg, "Your registration completed");
		
		logger.info("Test Passed");
		
//		if(confMsg=="Your registration completed") {
//			System.out.println("TEST PASSSEDDDD");
//			logger.info("TEST PASSED");
//			Assert.assertTrue(true);
//		}else {
//			System.out.println("TEST FAILEDDDDD");
//			logger.info("TEST FAILED");
//			Assert.assertTrue(false);
//		}
		
		
		
		}catch(Exception e) {
			logger.error("test failed");
			logger.debug("debug logs");
			Assert.fail();
			
		}
		
		logger.debug("Application Log Ends........");
		logger.info("*****TC_001 Account_Registration END*****");
		
		
	}
	
	
	
}
