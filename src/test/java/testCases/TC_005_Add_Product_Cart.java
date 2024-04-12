package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Add_Product_To_Cart;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_005_Add_Product_Cart extends BaseClass {

	@Test(groups = {"regression","master"})

	public void verfiyProductAddedToCart() throws InterruptedException {

		logger.info("**** TC_005_Add_Product_Cart Start ****");
		logger.debug("Application Debug Starts");

		HomePage hp = new HomePage(driver);
		hp.clickLoginLink();

		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		logger.info("entering email");
		lp.setPassword(p.getProperty("password"));
		logger.info("Entering Password");
		lp.clickLoginButton();
		logger.info("clicked on login button");

		Add_Product_To_Cart acd = new Add_Product_To_Cart(driver);
		acd.clickBuyButton();
		logger.info("Clicked on buy button");
		acd.selectingQuantity();
		logger.info("Selecting Quantity");
		acd.clickAddCartButton();
		logger.info("Clicked on add to cart button");
		acd.clickShoppingItemLink();
		logger.info("clicked on shopping item links");

		boolean headingPresence = acd.verifyShoppingCartHeading();
		if (headingPresence == true) {
			logger.info("Test Passed");
			Assert.assertTrue(true);
		} else {
			logger.info("Test Failed");
			Assert.fail();
		}

		logger.info("**** TC_005_Add_Product_Cart End ****");
		logger.debug("Application Debug End");

	}
}
