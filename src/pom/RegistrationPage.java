package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BasePage;

public class RegistrationPage  extends BasePage{
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signinbtn;
	@FindBy(xpath="//*[@id='sign-in']/div/div/div/a")
	private WebElement registerlnk;
	@FindBy(xpath="//a[.='REGISTER']")
	private WebElement Register;
	@FindBy(xpath="//input[@name='email' and @type='text']")
	private WebElement emailId;
	@FindBy(xpath="//input[@type='tel']")
    private WebElement passwordfield;	

	public RegistrationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnRegisterLoginLink() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		System.out.println("move to element");
		actions.moveToElement(signinbtn).perform();;
		System.out.println("click on the element");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='sign-in']/div/div/div/a")));
		System.out.println("click on register link");
		registerlnk.click();
		Thread.sleep(2000);
		Register.click();
	}
	
	public void setEmailIdTextField()
	{
		emailId.click();
	}
	
	public void setpasswordTextField()
	{
		passwordfield.click();
	}
	
	

}
