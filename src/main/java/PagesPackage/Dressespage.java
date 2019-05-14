package PagesPackage;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class Dressespage extends Base {
Actions action;
	public Dressespage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='center_column']/ul/li[1]")
	WebElement Dress1;
	
	@FindBy(xpath="//img[@class='replace-2x img-responsive' and @src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	WebElement Dress2;
	
	@FindBy(xpath="//img[@class='replace-2x img-responsive' and @src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
	WebElement Dress3;
	
	
	
	
	
	@FindBy(xpath="(//span[contains(.,'Add to cart')])[1]")
	WebElement Addtocart1;
	
	@FindBy(xpath="(//span[contains(.,'Add to cart')])[2]")
	WebElement Addtocart2;
	
	@FindBy(xpath="(//span[contains(.,'Add to cart')])[3]")
	WebElement Addtocart3;
	
	
	
	
	
	
	
	@FindBy(xpath = ".//span[@class='cross']")
	WebElement continueShopping;
	
	@FindBy(xpath="//span[contains(.,'Proceed to checkout')]")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement viewShopping;
	
	
	
	

	public void scrolldown() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		action=new Actions(driver);
		action.moveToElement(Dress1).build().perform();
		Thread.sleep(1000);
		Addtocart1.click();
		Thread.sleep(3000);
		continueShopping.click();
		
		
		action=new Actions(driver);
		action.moveToElement(Dress2).build().perform();
		Thread.sleep(1000);
		Addtocart2.click();
		Thread.sleep(3000);
		continueShopping.click();
		
		
		action=new Actions(driver);
		action.moveToElement(Dress3).build().perform();
		Thread.sleep(1000);
		Addtocart3.click();
		Thread.sleep(3000);
		proceedtocheckout.click();
		Thread.sleep(2000);
	}
	
	public ShoppingSummry movetocart() throws InterruptedException, IOException {
		viewShopping.click();
		Thread.sleep(3000);
		return new ShoppingSummry();
		
		
		
	}
	
	

}
