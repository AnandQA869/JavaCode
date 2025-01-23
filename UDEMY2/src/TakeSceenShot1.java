import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class TakeSceenShot1 {

	public static void main(String[] args) throws IOException {
        
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.youtube.com/watch?v=Ld9qJ4psQmI&list=PLacgMXFs7kl8e8xIdMDQEi2c6eQnO1toK&index=13");
      //TakesScreenshot ts=(TakeScreenshot) driver;
         
         //TakesScreenshot ts=(TakesScreenshot) driver;
         TakesScreenshot ts =(TakesScreenshot) driver;
         //TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        
        File target=new File("C:\\Users\\Anand Pramamik\\Downloads\\screenshsot\\screen.pdf");
        
        Files.copy(source, target);
        System.out.println("TakeScreenshot");
        
	}

}
