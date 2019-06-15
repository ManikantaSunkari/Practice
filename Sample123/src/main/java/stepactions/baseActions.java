package stepactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseActions {
	public WebDriver driver;
	
	public static WebDriver getWebDriver(String browser) {
		WebDriver driver=null;
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			return driver;
		}else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-1.exe");
			driver = new ChromeDriver();
			return driver;
		}
		return driver;	
	}
	
}
