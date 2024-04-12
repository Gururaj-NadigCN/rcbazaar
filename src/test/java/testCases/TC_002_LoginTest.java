package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups = {"sanity","master"})
	public void verify_login() {
		logger.info("****TC_002_LOGIN Starts****");
		logger.debug("capturing application debug logs");
		try {

			

			HomePage hp = new HomePage(driver);
			logger.info("Clicked on login link");
			// login link
			hp.clickLoginLink();

			LoginPage lp = new LoginPage(driver);
			logger.info("Entering email and password");
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			// login button
			lp.clickLoginButton();
			logger.info("clicked on login button..");

			MyAccountPage mp = new MyAccountPage(driver);
			logger.info("checking my account exists");
			boolean targetPage = mp.isHeadingExists();
			if (targetPage == true) {
				logger.info("Login Test Passed");
				Assert.assertTrue(true);
			} else {
				logger.error("Login Test Failed");
				Assert.fail();
			}
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("****Finished Login Test****");

	}

}
