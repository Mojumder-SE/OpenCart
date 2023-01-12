package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		super (driver);
	}
	
	//Elements
	@FindBy (xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy (xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath ="//a[normalize-space()='Login']")
	WebElement linlLogin;
	
	//Actions Methods
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clicRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linlLogin.click();
	}
	

}
