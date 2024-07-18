 package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	// Construct 
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// defining page objects --------------------------------------
	
	// locating element of search text box
	@FindBy(id = "twotabsearchtextbox") 
	private WebElement searchtxtbox;
	
	// locating element of search icon
	@FindBy(id = "nav-search-submit-button") 
	private WebElement searchBtn;
	
	// locating element of search category DropDown
	@FindBy(id = "searchDropdownBox") 
	private WebElement selectCategoryDropdown;
	
	
	// Encapsulation -----------------------------------------------
	
	// Navigating Amazon Home page URL
	public void navigateHomePage() {
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	// Entering product name in search text box
	public void enterSearchBox(String productName) {
		searchtxtbox.sendKeys(productName);
	}
	
	// Clicking the search icon
	public void clickSearchBtn() {
		searchBtn.click();;
	}
	
	 
	
	public WebElement getSelectCategoryDropdown() {
		return selectCategoryDropdown;
	}

	// fetching the option-values category DropDown
	public void selectCategory(List<String> dropdownValues) {
		
		Select dropdown = new Select(selectCategoryDropdown);
		List<WebElement> options = dropdown.getOptions();
		
		for(WebElement option : options) {
			dropdownValues.add(option.getText());
		}
	
		
	}
	
		
	// Select perform search category DropDown and randomly select any option
	public void SelectOptionRandomly(List<String> dropdownValues,String Value) {
		
		Select dropdown = new Select(selectCategoryDropdown);
		// create a instance class of 'Random'
		Random random = new Random();

		// fetching size of dropdownValues and stored in variable
		int randomIndex = random.nextInt(dropdownValues.size());
		String randomValue = dropdownValues.get(randomIndex);

		// select randomly one option from category
		dropdown.selectByVisibleText(randomValue);
	}
	
}