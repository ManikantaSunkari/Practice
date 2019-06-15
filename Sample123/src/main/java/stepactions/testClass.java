package stepactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testClass {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-1.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://mvnrepository.com");
	}
}
