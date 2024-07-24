package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import com.pom.Clickfashonandmens;

public class pageobject {
	
	WebDriver driver;
	
	
	private Clickfashonandmens cfm;


	public Clickfashonandmens getCfm() {
		cfm = new Clickfashonandmens(driver);
		
		return cfm;
	}
	
	
public pageobject (WebDriver gt) {
		
		driver = gt;
		PageFactory.initElements(driver, this);
		
		
		
		
	}



	
	
	

}
