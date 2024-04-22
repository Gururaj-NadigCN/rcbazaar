package testCases;

import org.testng.annotations.Test;

import pageObjects.AdvancedSearchFunctionality;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_009_Advanced_Search_Functionality extends BaseClass {
	
	@Test(groups= {"regression"})
	
	public void verifyAdvancedSearch() throws InterruptedException {
		
		logger.info("TC_009_Advanced_Search_Functionality Test Starts");
		logger.debug("Advanced Search Debug Starts");
		
		HomePage hp=new HomePage(driver);
		hp.clickLoginLink();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("learningpath1995@gmail.com");
		lp.setPassword("test@123");
		lp.clickLoginButton();
		Thread.sleep(6000);
		
		AdvancedSearchFunctionality asf=new AdvancedSearchFunctionality(driver);
		asf.clickAdvancedSearch();
		asf.enterSearchKeyword("air");
		asf.checkAdvancedSearch();
		asf.selectCategory();
		asf.selectManufactrer();
		asf.enterFromPrice("1000");
		asf.enterToPrice("2000");
		Thread.sleep(5000);
		asf.clickSearchButton();
		Thread.sleep(6000);
		
		
		logger.info("TC_009_Advanced_Search_Functionality Test Ends");
		logger.debug("Advanced Search Debug Ends");
	}
}
