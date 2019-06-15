package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Data;
import stepactions.baseActions;

@Data
public class sampleOR {
	public WebDriver driver;
	
	public sampleOR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	public WebElement txtUsername;
	
	@FindBy(xpath="")
	public WebElement txtPassword;
	
	@FindBy(xpath="")
	public WebElement btnSubmit;
	
}

