import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageUsingPOM {
WebDriver driver;

LoginPageUsingPOM(WebDriver d)
{
	driver=d;
}

By username=By.id("user-name");
By password=By.id("password");
By login=By.id("login-button");

}




