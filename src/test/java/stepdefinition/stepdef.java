package stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pageobjectmanager.pageobject;

import Runnerclass.classrunner;
import filereader.filereadermanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef extends classrunner {

	pageobject j = new pageobject(driver);

	@Given("User Launch the Amazon Application Url")
	public void user_launch_the_amazon_application_url() throws Exception {

		urllaunch(filereadermanager.FileReaderr().geturl());
		Thread.sleep(5000);

	}

	@When("user click the fashion button")
	public void user_click_the_fashion_button() throws Exception {
		
		clickonelement(j.getCfm().getFashion());
		Thread.sleep(5000);

	}

	@Then("user click the mens clothing button")
	public void user_click_the_mens_clothing_button() throws Exception {
		
		clickonelement(j.getCfm().getMens());
		Thread.sleep(5000);

	}

	
	
	@Given("user click the rating {int} or above button")
	public void user_click_the_rating_or_above_button(Integer int1) throws Exception {
		
		js_click(j.getCfm().getRating());
		  clickonelement(j.getCfm().getRating());
		  Thread.sleep(5000);
	}

	
	

	@Given("user fix the price min {int}")
	public void user_fix_the_price_min(Integer int1) throws Exception {
	
		js_scroll(j.getCfm().getMin1000(), "1000");
		Thread.sleep(5000);
	   
	}

	@Given("uesr fix the price max {int}")
	public void uesr_fix_the_price_max(Integer int1) throws Exception {
		
		js_scroll(j.getCfm().getMax5000(), "5000");
		
		Thread.sleep(5000);
	   
	}

	@Given("user click the go button")
	public void user_click_the_go_button() {
	   
		clickonelement(j.getCfm().getGo());
		
	}
	
	
	
	@Given("user select the Allen solly Brand")
	public void user_select_the_allen_solly_brand() throws Exception {
		
		clickonelement(j.getCfm().getAllensolly());
		Thread.sleep(5000);
	}

	
	
	@Given("user select the U.S POlO ASSAN")
	public void user_select_the_u_s_p_ol_o_assan() throws Exception {
	
		
		clickonelement(j.getCfm().getUspolo());
		
		Thread.sleep(5000);
	  
	}

	
	
	@When("user print the numbers after filteraztion")
	public void user_print_the_numbers_after_filteraztion() throws Exception {
		
		gettext(j.getCfm().getText());
		
		 Thread.sleep(5000);
	   
	}
	


	@When("user click second product of the page")
	public void user_click_second_product_of_the_page() {
		
		 List<WebElement> findElements = driver.findElements(By.xpath("//div[@class=\\\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20\\"));
		
		  if (findElements.size() > 1) {
              WebElement secondProduct = findElements.get(1);
              secondProduct.click();
		  }
		
	}

	@When("user add to cart of that product")
	public void user_add_to_cart_of_that_product() {
		
		clickonelement(j.getCfm().getAddtocart());
	    
		
		
	}

	
	
	
	
	
	
}
