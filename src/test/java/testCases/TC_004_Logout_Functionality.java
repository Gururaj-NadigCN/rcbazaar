package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogOutPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_Logout_Functionality extends BaseClass {

	@Test(groups= {"sanity"})
	public void verifyLogout() {
		logger.info("**** TC_004_Logout_Functionality ****");
		logger.debug("Application Debug Starts");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickLoginLink();
			logger.info("Clicked on Login Link");

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			logger.info("Entered Email");
			lp.setPassword(p.getProperty("password"));
			logger.info("Entered Password");
			lp.clickLoginButton();
			logger.info("Clicked on Login Button");

			LogOutPage lop = new LogOutPage(driver);
			lop.logoutLink();
			logger.info("Clicked on Logout Link");

			boolean checkStatus = lop.checkHeadingAfterLogout();
			if (checkStatus == true) {
				logger.info("Test passed");
				Assert.assertTrue(true);
			} else {
				logger.info("Test failed");
				Assert.fail();
			}
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("**** TC_004_Logout_Functionality ****");
		logger.debug("Application Debug Ends");
	}
}
