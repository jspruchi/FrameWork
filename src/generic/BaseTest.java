package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  class BaseTest implements AutoConst{
	public WebDriver driver;
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.shopclues.com/");
	}
	
	@AfterMethod
	public void closeApplication()
	{
		//driver.quit();
	}
	
	
	

}
