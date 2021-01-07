package Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ParametersTest {

	WebDriver driver;
	
	@Parameters({"browser","url","emailId"})
	
	@Test
	public void yahooLogin(String browser,String url, String emailId)
	{
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
	}
}
