package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductDetails;
import testBase.BaseClass;

public class TC_003_ProdcutDertails extends BaseClass {

	@Test(groups = {"sanity"})
	public void verifyProductDetails() {
		logger.info("****TC_003_Product Details Start****");
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

			ProductDetails pd = new ProductDetails(driver);

			pd.clickBtnProductDetails();
			logger.info("Clicked on details button");
			boolean productDetail = pd.isDetailsExists();
			logger.info("Checking Product Details Displayed??");
			if (productDetail == true) {
				logger.info("Test Passed");
				Assert.assertTrue(true);
			} else {
				logger.error("Login Test Failed");
				Assert.fail();
			}
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("****TC_003_Product Details End****");
		logger.debug("capturing application debug logs");
	}
}
