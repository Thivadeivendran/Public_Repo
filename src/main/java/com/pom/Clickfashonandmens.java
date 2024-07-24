package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickfashonandmens {

	WebDriver driver;

	@FindBy(xpath = "(//a[@class=\"nav-a  \"])[10]")
	private WebElement fashion;

	@FindBy(xpath = "(//span[@class=\"sl-sobe-carousel-sub-card-title\"])[1]")
	private WebElement mens;

	@FindBy(xpath = "//div[@aria-label=\"4 Stars & Up\"]")
	public WebElement rating;
	
	@FindBy(xpath = "//span[text() ='Allen Solly']//parent::a[@rel=\"nofollow\"]")
	private WebElement allensolly;
	
	@FindBy(xpath = "//span[text() = 'U.S. POLO ASSN.']")
	private WebElement uspolo;
	
	@FindBy(xpath = "//input[@name = 'low-price']")
	private WebElement min1000;
	
	@FindBy(xpath = "//input[@name = 'high-price']")
	private WebElement max5000;
	
	@FindBy(xpath = "//span[text() = 'Go']//..//../input")
	private WebElement go;
	
	@FindBy(xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
	private WebElement text;
	
//	@FindBy(xpath = "//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20\"]")
//	private WebElement productselect;
	
	@FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
	private WebElement addtocart;
	

	public WebElement getAllensolly() {
		return allensolly;
	}

	public WebElement getUspolo() {
		return uspolo;
	}

	public WebElement getMin1000() {
		return min1000;
	}

	public WebElement getMax5000() {
		return max5000;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getFashion() {

		return fashion;
	}

	public WebElement getMens() {

		return mens;
	}

	public WebElement getRating() {
		return rating;
	}
	
	public WebElement getText() {
		return text;
	}
	
	public WebElement getProductselect() {
		return productselect;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public Clickfashonandmens(WebDriver dr) {

		driver = dr;
		PageFactory.initElements(driver, this);

	}

	

	

}
