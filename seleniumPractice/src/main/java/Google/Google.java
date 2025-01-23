package Google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Navigate to Amazon
        driver.get("https://www.amazon.in/");
        
        // Click on the sign-in link
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        
        // Enter email or phone number
        driver.findElement(By.id("ap_email")).sendKeys("9560802997");
        
        // Click continue
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        // Enter password
        driver.findElement(By.id("ap_password")).sendKeys("Anand@340");
        
        // Optionally click 'Keep me signed in'
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        
        // Click Sign-In
        driver.findElement(By.id("signInSubmit")).click();
        
        // Perform search
        driver.findElement(By.id("searchDropdownBox")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // Click on a product link (first one found)
        driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();

        // Scroll down the page using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        // Print confirmation
        System.out.println("Welcome to Amazon");

        // Sleep for 5 seconds to observe the action
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}
