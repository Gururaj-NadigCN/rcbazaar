package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchFunctionality extends BasePage{
	
	public AdvancedSearchFunctionality(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Advance search']")WebElement advancedSearch;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_txtSearchTerm']")WebElement textBoxAdvancedSearch;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_cbAdvancedSearch']")WebElement checkBoxAdvancedSearch;
	
	@FindBy(xpath="//select[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_ddlCategories']")WebElement selectCategories;
	
	@FindBy(xpath="//select[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_ddlManufacturers']")WebElement selectManufacturer; 
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_txtPriceFrom']")WebElement fromPrice;
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_txtPriceTo']")WebElement toPrice;
	
	@FindBy(xpath="//input[@id='ctl00_ctl00_cph1_cph1_ctrlSearch_btnSearch']")WebElement btnSearch;
	
	public void clickAdvancedSearch() {
		advancedSearch.click();
	}
	
	public void enterSearchKeyword(String keyword) {
		textBoxAdvancedSearch.sendKeys(keyword);
	}
	
	public void checkAdvancedSearch() {
		checkBoxAdvancedSearch.click();
	}
	
	public void selectCategory() {
		Select dropdownCategory=new Select(selectCategories);
		dropdownCategory.selectByIndex(10);
	}
	
	public void selectManufactrer() {
		Select dropdownManufacturer=new Select(selectManufacturer);
		dropdownManufacturer.selectByIndex(0);
	}
	
	public void enterFromPrice(String fromPri) {
		fromPrice.sendKeys(fromPri);
	}
	
	public void enterToPrice(String toPri) {
		toPrice.sendKeys(toPri);
	}
	
	public void clickSearchButton() {
		btnSearch.click();
	}
	
	
	
}
