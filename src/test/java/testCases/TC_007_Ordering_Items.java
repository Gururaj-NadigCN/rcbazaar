package testCases;

import org.testng.annotations.Test;

import pageObjects.Add_Product_To_Cart;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderingItems;
import testBase.BaseClass;

public class TC_007_Ordering_Items extends BaseClass{
	
	@Test
	
	public void verifyOrderingItems() throws InterruptedException {
		
		logger.info("TC_007 Orderring Items Test Starts");
		logger.debug("Debug Starts");
		
		HomePage hp=new HomePage(driver);
		hp.clickLoginLink();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("learningpath1995@gmail.com");
		lp.setPassword("test@123");
		lp.clickLoginButton();
		
		Add_Product_To_Cart adc=new Add_Product_To_Cart(driver);
		adc.clickBuyButton();
		adc.selectingQuantity();
		adc.clickAddCartButton();
//		adc.clickAlert();
//		adc.clickShoppingItemLink();
		
		
		//ordering class object need to be created 
		
		OrderingItems orditems=new OrderingItems(driver);
		orditems.clickShopLink();
		orditems.clickCheckOut();
		orditems.clickShipToAddress();
		orditems.clickSelectShipper();
		orditems.clickProceedCheckOut();
		orditems.clickContinueShipping();
		orditems.clickOnBillingAddress();
		orditems.clickPaymentMethod();
		orditems.clickTermsAndConditions();
		orditems.clickBtnNext();
		
		
	}
	
}
