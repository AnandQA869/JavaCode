package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHFORMAKEMYTRIP {
    public static void main(String[] args) {
        // Set up the WebDriver and open the browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the target URL
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-18/01/2025&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");

        // Find the desired checkbox using the correct XPath
        WebElement indiGoCheckbox = driver.findElement(By.xpath("//input[@id='listingFilterCheckbox' and @value='IndiGo']"));

        // Use JavascriptExecutor to click the checkbox
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", indiGoCheckbox);

        // Optional: Add some delay to observe the change
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
