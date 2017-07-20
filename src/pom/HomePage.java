package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage{
	
	@FindBy(xpath="//a[contains(.,'Offers')]")
	private WebElement link;
	@FindBy(xpath="//a[contains(.,'Door Step Warranty Mobiles Upto 60% off')]")
	private WebElement DoorLink;
	@FindBy(xpath="(//h3[.='Asus ZE551ML / 4GB + 32GB / Fast Charging / PixelMaster Backlight (Super HDR) - (6 Months Brand Warranty)'])[1]/../..//span[.='Free Shipping']/../../../..")
	private WebElement productAsus;
	@FindBy(xpath="//span[.='Red']")
	private WebElement color;
	@FindBy(xpath="//button[contains(text(),'Add To Cart') and @id='add_cart']")
	private WebElement addtocart;
	
	
	
    public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
    
    public void clickOnOfferLink() throws InterruptedException
    {
    	Actions actions= new Actions(driver);
    	actions.moveToElement(link).perform();
    	Thread.sleep(2000);
    	DoorLink.click();
    	Set<String> allWHS = driver.getWindowHandles();
    	
    	for(String wh:allWHS)
    	{
    		driver.switchTo().window(wh);
    	}
    	
   }
    public void clickOnProductAsUs() throws InterruptedException
    {
    	productAsus.click();
    	Set<String> s1 = driver.getWindowHandles();
    	for(String wh:s1)
    	{
    		driver.switchTo().window(wh);
    	}
    	
    	Thread.sleep(2000);
    	color.click();
    	addtocart.click();
    	
    	
    
   }
    
   
    
    
    
	
}
	
	

	
	
	
	
	

	
	
	
	


