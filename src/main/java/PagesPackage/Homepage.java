package PagesPackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class Homepage extends Base {



@FindBy(xpath="//img[@class='logo img-responsive']")
WebElement logo;


@FindBy(xpath="(//a[contains(@title,'Dresses')])[5]")
WebElement DressesTab;






public Homepage() throws IOException {
  PageFactory.initElements(driver, this);
  

}



public String validatetitle() {
	String title=driver.getTitle();
    return title;
	}

public boolean validatelogo() {
	boolean flag=logo.isDisplayed();
    return flag;
   
}

public Dressespage dressestab() throws InterruptedException, IOException {
	DressesTab.click();
	Thread.sleep(2000);
	return new Dressespage();
}



   






}
