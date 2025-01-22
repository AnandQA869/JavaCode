package Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage {
	ChromeDriver driver;
@FindBy(xpath="//span[@class='nav-line-2 '] ")
WebElement accountandlist;

	public void accountandlist(ChromeDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();	
	}
	public  Amazon_HomePage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
}
 
