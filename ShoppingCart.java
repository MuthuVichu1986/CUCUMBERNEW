package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCart {

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a/i")
	WebElement carticon;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	WebElement checkOutBtn;
	
	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void doClickCart() {
		carticon.click();
	}
	public void doCheckOut() {
		checkOutBtn.click();
	}
}
