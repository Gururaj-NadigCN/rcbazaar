package testCases;

import org.checkerframework.checker.units.qual.m;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountDetails;
import testBase.BaseClass;

public class TC_008_My_Account_Details extends BaseClass {
	@Test
	public void verfiyMyAccountDetails() throws InterruptedException {

		logger.info("TC_008_My_Account_Details Starts");
		logger.debug("TC_008_My_Account_Details Debug Starts");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickLoginLink();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail("learningpath1995@gmail.com");
			lp.setPassword("test@123");
			lp.clickLoginButton();
			Thread.sleep(6000);

			MyAccountDetails mad = new MyAccountDetails(driver);
			mad.clickMyAccountDetails();
			mad.clickCustomerAddressesDetails();
			mad.clickCustomerOrders();
			mad.clickChangePassword();

//			String customerInfo = mad.checkPersonalDetails();
//			if (customerInfo == "Your Personal Details") {
//				logger.info("Test Passed");
//				Assert.assertTrue(true);
//			} else {
//				Assert.fail();
//			}
//
//			String customerAddress = mad.checkBillingAddress();
//			if (customerAddress == "Billing Address Book Entries") {
//				Assert.assertTrue(true);
//			} else {
//				Assert.fail();
//			}
//
//			boolean checkcustomeraddress = mad.checkCustomerOrders();
//			if (checkcustomeraddress == true) {
//				Assert.assertTrue(true);
//			} else {
//				Assert.fail();
//			}
//
//			boolean changepassword = mad.checkChangePassword();
//			if (changepassword == true) {
//				Assert.assertTrue(true);
//			} else {
//				Assert.fail();
//			}
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("TC_008_My_Account_Details Ends");
		logger.debug("TC_008_My_Account_Details Debug Ends");
	}
}
