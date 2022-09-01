package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public Base() {
	}
	
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver","C:/QA/CUCUMBER_TEST/e2e/src/test/java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait  = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	public static void navigateToHomePage() {
		driver.navigate().to("https://www.w3schools.com/");
	}

}
