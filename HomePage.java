package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(name="search")
	WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement searchicon;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void searchItems(String srhitem) {
		searchbox.sendKeys(srhitem);
		searchicon.click();
	}

}
