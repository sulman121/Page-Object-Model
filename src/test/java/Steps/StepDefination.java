package Steps;


import org.testng.Assert;
import java.io.IOException;
import java.util.ArrayList;

import BaseClass.Base;
import PagesPackage.Dressespage;
import PagesPackage.Homepage;
import PagesPackage.ShoppingSummry;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination extends Base {

	public StepDefination() throws IOException {
		super();

	}

	Homepage homepage;
	Dressespage dressespage;
	ShoppingSummry shoppingsummry;

	@Before
	public void start() throws IOException {
		initialzation();
		homepage = new Homepage();
		dressespage=new Dressespage();
		shoppingsummry=new ShoppingSummry();
        
	}
    
	@Given("user is at homepage and validate the title")
	public void user_is_at_homepage() {
		String title = homepage.validatetitle();
		System.out.println(title);
      Assert.assertEquals(title,"My Store");

	}

	@Then("^user validate the logo$")
	public void logo() {
		boolean flag = homepage.validatelogo();
		Assert.assertTrue(flag);

	}
	@Then("^user Click on the Dressestab$")
	   public void dresstab() throws Exception, IOException  {
		homepage.dressestab();
		
	}
	@Then("^user scrolldown and put to cart all five dresses$")
	public void select_dresses() throws InterruptedException {
		dressespage.scrolldown();
	}
	
	@Then("^user move to summry page$")
	public void checkoutprocess() throws InterruptedException, IOException {
		dressespage.movetocart();
	}
	
	
	@Then("^user verify all the prices$")
	public void verify_prices() {
	ArrayList<String> list= shoppingsummry.pricecheck();
	System.out.println(list);
	Assert.assertEquals(list.get(0),"$28.98","Pricematched" );
	Assert.assertEquals(list.get(1),"$50.99","Pricematched" );
	Assert.assertEquals(list.get(2),"$26.00","Pricematched" );
	
		
	}
	
	@Then("^Total price equal to sum of each prices$")
	public void sum() {
		shoppingsummry.totalprice();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void teardown() {
		driver.quit();
	
		
	}
}
