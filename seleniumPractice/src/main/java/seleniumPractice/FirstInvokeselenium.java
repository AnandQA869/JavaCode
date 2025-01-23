package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstInvokeselenium {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open Amazon India website
        driver.get("https://www.amazon.in/");
        
        // Click on 'Sign-In' link
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        
        // Enter email or phone number
        driver.findElement(By.id("ap_email")).sendKeys("9560802997");
        
        // Click on the continue button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        // Enter password
        driver.findElement(By.id("ap_password")).sendKeys("Anand@321");
        
        // Click 'Keep me signed in' checkbox
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        
        // Click on the Sign-In button
        driver.findElement(By.id("signInSubmit")).click();
        
        // Select category from dropdown
        driver.findElement(By.cssSelector("select[id='searchDropdownBox']")).click();
        
        // Search for "mobile"
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
        
        // Click search button
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // Click on the first search result
        driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
        
        // Output confirmation message
        System.out.println("Welcome to Amazon");

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
