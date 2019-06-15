package stepactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import objectrepository.sampleOR;

public class sampleStepActions {

	public sampleOR or;
	public baseActions base;
	WebDriver driver;
	
	public sampleStepActions() {
		// this.or = new sampleOR();
		this.base = new baseActions();
		driver = baseActions.getWebDriver("chrome");
		or = new sampleOR(driver);

	}

	public void OpenBrowser() {
		ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/newreport.html");
		com.aventstack.extentreports.ExtentReports extent = new com.aventstack.extentreports.ExtentReports();
		extent.attachReporter(report);
		com.aventstack.extentreports.ExtentTest logger = extent.createTest("Login Test");
		logger.log(Status.PASS, "Start Test");
		
		
		
		
		driver.get("https://www.google.com");
		
		if (driver.getCurrentUrl().contains("phal")) {
			logger.log(Status.PASS, "User navigated to correct url");
		}else {
			logger.log(Status.FAIL, "Failed to navigated to url");
		}
		
		

		or.txtUsername.sendKeys("asdfasdf");
		or.txtPassword.sendKeys("asefasdf");
		or.btnSubmit.click();
		
		
		
		
		
		
		logger.log(Status.PASS, "End Test");	
		extent.flush();
	}

	public void Login() {

		WebElement AMSLink = driver.findElement(By.xpath("//a[@class='links_icon']"));
		AMSLink.click();
//				driver.manage().timeouts().implicitlyWait(10,SECONDS);
//				
		WebElement btnLogin = driver.findElement(By.xpath("//a[@id='ctl00_LoginStatus2']"));
		btnLogin.click();
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@name='ctl00$maincontent$Login1$LoginButton']"));
		btnSubmit.click();

//		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='User_Id']"));
//		txtUsername.sendKeys("manikick123");
//		WebElement TxtBoxContent = driver.findElement(By.xpath("//img[@src='/IbsImages/uv1_ls_skp_h1.gif']"));
//		TxtBoxContent.getText();	
//		System.out.println("Printing "+TxtBoxContent);
//		WebElement txtPasswordKeyword= driver.findElement(By.xpath("//img[@src='/IbsImages/uv1_ls_skp_h1.gif']"));
//		txtPasswordKeyword.click();
//		WebElement txtPassword = driver.findElement(By.xpath("//div[@class='cl fl']/div[1]/div[2]/div[2]/input[@name='password']"));
//		txtPassword.sendKeys("Tiru@593");
//		WebElement btnSubmit = driver.findElement(By.xpath("//div[@class='cl fl ls_login']"));
//		btnSubmit.click();

	}

}
