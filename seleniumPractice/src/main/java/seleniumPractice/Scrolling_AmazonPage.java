package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Scrolling_AmazonPage {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stuSb
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.amazon.com.au");
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,1000)");
Thread.sleep(2000);
}

}
