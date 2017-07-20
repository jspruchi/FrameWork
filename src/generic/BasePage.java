package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait= new WebDriverWait(driver, 5);
		try{
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("Title is matching: pass" ,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching: failed" ,true);
			Assert.fail();
			
		}
	}

}
