package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.HomePage;
import pom.WelcomePage;

public class ClickonSignInLink extends BaseTest {
	 @Test(priority=1)
	public void testClickOnSignInLnk() throws InterruptedException
	{
		WelcomePage w= new WelcomePage(driver);
		Thread.sleep(5000);
		w.clickonSignInLink();
		Thread.sleep(2000);
		String emailid=Excel.getCellData(INPUT_PATH, "ClickonSignInLink", 0, 0);
		w.setEmailId(emailid);
		Thread.sleep(2000);
		String pwd=Excel.getCellData(INPUT_PATH, "ClickonSignInLink", 0, 1);
		w.setPassword(pwd);
		Thread.sleep(2000);
		w.clickOnLogin();
		Thread.sleep(5000);
		w.SignoutLink();
		
	}
	   
	   @Test(priority=2)
		public void TestselectProduct() throws InterruptedException
		{
			HomePage h1= new HomePage(driver);
			h1.clickOnOfferLink();
			Thread.sleep(3000);
			h1.clickOnProductAsUs();
			Thread.sleep(2000);
			
	}
	 

	/*@Test
	public void testRegistration() throws InterruptedException
	{
		RegistrationPage r1= new RegistrationPage(driver);
		r1.clickOnRegisterLoginLink();
		Thread.sleep(2000);
		r1.setEmailIdTextField();
		Thread.sleep(2000);
		r1.setpasswordTextField();
		
	}
	*/
	   
	  
}
