package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {	
	
	WebDriver driver;
	
	// Constructor
	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Define PageObjects
	
	
	// locate element search result(1) --name : Wireless Headphones
	@FindBy(xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[3]") 
	private WebElement searchResultName;

		
	// locate element of result page(1) --SONY Headphones
	@FindBy(xpath = "//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-4\"]/a/span")
	private List<WebElement> filterResultSony;
	
	
	// locate element of result(2) --Random Ir-relevent Keyword
	@FindBy(xpath = "//div[@data-cy=\"title-recipe\"]/h2/a/span")
	private List<WebElement> noOfResult;

	// locate element of result(3) --LAPTOPS
	@FindBy(xpath = "//div[@data-cy=\"title-recipe\"]/h2/a/span")
	private List<WebElement> laptopResult;
	
	// locate element of result(4) -- LAPTOPS
	@FindBy(xpath = "(//div[@data-cy=\"title-recipe\"]/h2/a/span)[1]")
	private WebElement iterateResult1;
	
		

	public WebElement getSearchResultName() {
		return searchResultName;
	}
	
	public List<WebElement> getFilterResult() {
		return filterResultSony;
	}
	
	
	
	// fetching one product name 
	public String printProductsNames() {
		
		 return filterResultSony.get(1).getText();				
		
	}	
	
	// fetching No of products this page
	public int noOfProduct() {
		return noOfResult.size();
	}
	
	// fetching Laptops result
	public String laptopResult() {
		
		return laptopResult.get(3).getText();
	}
	
	// fetching Laptops result Apple, Dell, HP Laptops
	public String iterateResult1() {			
		
		return iterateResult1.getText();		
		
	}
	
	

}