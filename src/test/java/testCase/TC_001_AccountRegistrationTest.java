package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups= {"Regression","Master"})
	void test_account_Registration()
	{
		logger.debug("application logs.....");
		logger.info("***  Starting TC_001_AccountRegistrationTest  ***");
		
		try
		{
		
		HomePage hp = new HomePage(driver); //
		
		hp.clickMyAccount();
		logger.info("Clicked on My account link");
		hp.clicRegister();
		logger.info("Clicked on register link");
		
		AccountRegistrationPage AcRegPage = new AccountRegistrationPage(driver);
		
		logger.info("Providing customer data");
		
		//AcRegPage.setFistName("abc");
		AcRegPage.setFistName(randomeString().toUpperCase()); //dinamicly generated
		
		//AcRegPage.setLastName("xyz");
		AcRegPage.setLastName(randomeString().toUpperCase());
		
		
		//AcRegPage.setEmail("abcxyz@gmail.com");
		AcRegPage.setEmail(randomeString()+"@gmail.com"); //randomly email
		
		// AcRegPage.setPhoneNumber(randomeNumber()) //rendomly phone number
		
		
		// String password=randomAlphaNumeric(); //this statement will use while we have two password fild and it will generated same password
		// AcRegPage.setPassword(password);
		// AcRegPage.setConfirmPassword(password);
		
		AcRegPage.setPassword(randomAlphaNumeric());
		
		AcRegPage.setPrivacyPolicy();
		
		AcRegPage.clickContinue();
		logger.info("Clicked on continue");
				
		String confmsg=AcRegPage.getConfirmationMsg();
		
		logger.info("Validating expected message");
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!" , "test failed");
		}
		catch (Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest  ***");
	}
	

	

}
