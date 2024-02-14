package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a")
	WebElement searchlist;
	
	@FindBy(id="button-cart")
	WebElement addCartBtn;
	
	public SearchResult(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public boolean isItemListed() {
		return searchlist.isDisplayed();
		
	}
	public void viewItemDetails() {
		searchlist.click();
	}
	public void addToCart() {
		addCartBtn.click();
	}
}
