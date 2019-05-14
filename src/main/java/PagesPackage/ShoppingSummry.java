package PagesPackage;

import java.io.IOException;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.Base;

public class ShoppingSummry extends Base {

	public ShoppingSummry() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"total_product_price_5_19_0\"]")
	WebElement price1;

	@FindBy(xpath = "//span[@id='total_product_price_4_16_0']")
	WebElement price2;

	@FindBy(xpath = " //span[@id='total_product_price_3_13_0']")
	WebElement price3;

	public ArrayList<String> pricecheck() {

		ArrayList<String> list = new ArrayList<String>();
		list.add(price1.getText());
		list.add(price2.getText());
		list.add(price3.getText());

		return list;
   
		}
   
	public void totalprice() {
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add(price1.getText());
		list1.add(price2.getText());
		list1.add(price3.getText());
		
		double sum = 0;
		for(int i=0; i<list1.size(); i++) {
			sum = sum + Double.parseDouble(list1.get(i).substring(1));
			System.out.println(sum);
			
			
		}
	    double total = sum+sum*6/100;
	    System.out.println(total);
//		int sum=0;
//		for(int i=0;i<list1.size();i++) {
//			 sum=sum+(parseInt(list1.get(i)));
//			
//		}
	}

	
	
	
	

}
