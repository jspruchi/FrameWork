package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;

public class WelcomePage  extends BasePage{
	//declaration
	@FindBy(xpath="(//a[.='Sign In'])[1]")
	private WebElement signInLnk;
	@FindBy(xpath="//input[@type='text' and  @id='main_user_login']")
	private WebElement emailIdTB;
	@FindBy(name="password")
	private WebElement pwdTB;
	@FindBy(id="login_button")
	private WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Hi ruchee')]")
	private WebElement gtLink;
	@FindBy(xpath="//a[contains(text(), 'Sign Out')]")
	private WebElement signOutbtn;
	
	
	public WelcomePage(WebDriver driver) {
		super(driver);
		//initialization
		PageFactory.initElements(driver, this);
	}
	//utilization
      
	public void clickonSignInLink()
	{
		signInLnk.click();
	}
	
	public void setEmailId(String emailid)
	{
		emailIdTB.sendKeys(emailid);
	}
	public void setPassword(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		loginBtn.click();
	}
	public void SignoutLink() throws InterruptedException
	{         Actions actions= new Actions(driver);
	             actions.moveToElement(gtLink).perform();
	             System.out.println("move to element");
	             Thread.sleep(3000);
	             signOutbtn.click();
	             System.out.println("click on element");


		
	}
	
	
	
	

}
