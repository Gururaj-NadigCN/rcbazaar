package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotLinkFunctionality;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_006_Fogot_Link_Functionality extends BaseClass {

	@Test
	public void verifyForgotLink() {

		HomePage hp = new HomePage(driver);
		hp.clickLoginLink();

		logger.info("TC_006_ForgotLink Test Started");
		logger.debug("Debug Starts");
		try {
			ForgotLinkFunctionality flf = new ForgotLinkFunctionality(driver);
			flf.clickForgotLink();
			logger.info("Clicking on forgot link");
			flf.enterForgtLinkEmail("learningpath1995@gmail.com");
			logger.info("Entering Email");
			flf.clickBtnRecover();
			logger.info("Clicking on recover button");
			String confMsg = flf.checkConfirmation();
			if (confMsg.equals("Email with instructions has been sent to you.")) {
				logger.info("Test Passed");
				Assert.assertTrue(true);
			} else {
				logger.info("Test failed");
				Assert.fail();
			}
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("TC_006_ForgotLink Test Ended");
		logger.debug("Debug Ends");
	}
}
