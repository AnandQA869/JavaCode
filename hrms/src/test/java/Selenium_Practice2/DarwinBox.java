package Selenium_Practice2;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarwinBox {

    public static void main(String[] args)  {
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Maximize the window
        driver.manage().window().maximize();
        
        // Navigate to Darwinbox login page
        driver.get("https://cafehrvarunagroup.darwinbox.in/user/login");
        
        // Enter username and password
        driver.findElement(By.cssSelector("input#UserLogin_username")).sendKeys("00004996");
        driver.findElement(By.cssSelector("input#UserLogin_password")).sendKeys("Anand@340");
        
        // Click on the login button
        driver.findElement(By.id("login-submit")).click();
        
        // Click on some module after login
        driver.findElement(By.className("module-icon-wrapper")).click();
        
        // Navigate back to the previous page
        driver.navigate().back();
        
        // Click on Employees icon
        driver.findElement(By.xpath("//img[@src='/images/Icons_latest/employees.png']")).click();
        
        // Navigate back to the previous page
        driver.navigate().back();
        
        // Click on pending posts
        driver.findElement(By.xpath("//span[@id='pending_posts_vibe']")).click();
        
        // Navigate back to the previous page
        driver.navigate().back();
        
        // Print a confirmation message
        System.out.println("WELCOME TO DARWIN BOX");
        
        // Close the browser
        driver.quit();
    }
}
