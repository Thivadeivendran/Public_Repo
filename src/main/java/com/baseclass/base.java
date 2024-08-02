package com.baseclass;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static WebDriver driver;

	// Browser launch
		public static void browserlaunch(String browser) {

			try {

				if (browser.equalsIgnoreCase("chrome")) {

					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();

				}

				else if (browser.equalsIgnoreCase("firefox")) {

					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();

				}

				else if (browser.equalsIgnoreCase("ie")) {

					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();

				} else {

					System.out.println("invaild launch");
				}

			} catch (Exception e) {

				System.out.println(e);

			}

			finally {

				driver.manage().window().maximize();
			}

		}

//		url launch

		public static void urllaunch(String url) {

			driver.get(url);

		}

//		sendkeys
		public static void inputelement(WebElement element, String data) {

			element.sendKeys(data);

		}

//		click on element
		public static void clickonelement(WebElement ele) {

			ele.click();

		}

//		Dropdown select and Deselect
		public static void dropdownmethods(WebElement element, String option, String data) {
			Select d = new Select(element);
			if (option.equalsIgnoreCase("index")) {
				int parseint = Integer.parseInt(data);
				d.selectByIndex(parseint);

			} else if (option.equalsIgnoreCase("value")) {

				d.selectByValue(data);

			} else if (option.equalsIgnoreCase("text")) {

				d.selectByVisibleText(data);
			}

		}

		public static void Deselect_dropdown(String option, WebElement element, String value) {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.deselectByValue(value);
			} else if (option.equalsIgnoreCase("text")) {
				s.deselectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				int n = Integer.parseInt(value);
				s.deselectByIndex(n);
			}
		}

//		screenshot
		public static void screenshot(String Name) throws IOException {

			TakesScreenshot s = (TakesScreenshot) driver;
			File screenshotAs = s.getScreenshotAs(OutputType.FILE);
			File screen = new File("C:\\Users\\RAJA\\work\\amazondiva\\screenshots\\" + Name + ".png");
			org.openqa.selenium.io.FileHandler.copy(screenshotAs, screen);

		}

//		close
		public static void close() {

			driver.close();

		}

//		quit
		public static void quit() {

			driver.quit();

		}

//		navigate methods
		public static void navigatemethods(String data) {

			if (data.equalsIgnoreCase("back")) {

				driver.navigate().back();
			} else if (data.equalsIgnoreCase("forward")) {

				driver.navigate().forward();

			} else if (data.equalsIgnoreCase("refresh")) {

				driver.navigate().refresh();
			} else {
				System.out.println("invaild mathod");
			}

		}

//		get title
		public static void title() {
			driver.getTitle();
		}

//		get current url
		public static void currenturl() {
			driver.getCurrentUrl();
		}

//		navigate to
		public static void navigateto(String url) {

			driver.navigate().to(url);

		}

		// Alert
		public static void alertfn(String option) {
			if (option.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			} else if (option.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}

		}

		public static void alertsendkeys(String data) {

			driver.switchTo().alert().sendKeys(data);
		}

		// Action

		public static void action(WebElement element, String value) {

			Actions a = new Actions(driver);
			if (value.equalsIgnoreCase("click")) {
				a.click(element).build().perform();
			} else if (value.equalsIgnoreCase("contextclick")) {
				a.contextClick(element).build().perform();
			} else if (value.equalsIgnoreCase("doubleclick")) {
				a.doubleClick(element).build().perform();
			} else if (value.equalsIgnoreCase("movetoelement")) {
				a.moveToElement(element).build().perform();
			}

		}

		public static void draganddrop(WebElement drag, WebElement drop) {
			Actions a = new Actions(driver);
			a.dragAndDrop(drag, drop).perform();
		}

		// frames
		public static void frame(String option, String value) {
			if (option.equalsIgnoreCase("index")) {
				int i = Integer.parseInt(value);
				driver.switchTo().frame(i);
			} else if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(value);
			} else if (option.equalsIgnoreCase("name")) {
				driver.switchTo().frame(value);
			} else if (option.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();
			}
		}

		public static void frameweb(WebElement element) {
			driver.switchTo().frame(element);
		}

//			robot
		public static void robot(String Key) throws Exception {
			Robot r = new Robot();

			if (Key.equalsIgnoreCase("down")) {

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			} else if (Key.equalsIgnoreCase("up")) {

				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
			} else if (Key.equalsIgnoreCase("enter")) {

				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} else {
				System.out.println("fail");
			}
		}

		// window handle and handles

		public static void windowhandle() {

			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);

		}

		public static void windowhandles() {

			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			for (String s : windowHandles) {

				driver.switchTo().window(s);
			}

		}

		// is enable is displayed and is selected

		public static boolean booleanmethods(String option, WebElement Element) {

			if (option.equalsIgnoreCase("isenabled")) {
				boolean enable = Element.isEnabled();
				return enable;
			} else if (option.equalsIgnoreCase("isdisplayed")) {
				boolean display = Element.isDisplayed();
				return display;
			} else if (option.equalsIgnoreCase("isselected")) {
				boolean select = Element.isSelected();
				return select;

			}
			return false;

		}

		// getoption
		public static void getoption(WebElement Element) {
			Select s = new Select(Element);
			List<WebElement> options = s.getOptions();
			for (WebElement op : options) {
				System.out.println(op.getText());
			}

		}

		// gettext
		public static void gettext(WebElement element) {

			String text = element.getText();
			System.out.println(text);

		}

		// getattribute
		public static void getattribute(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
		}

		// wait

		public static void waitmethod(int t) {
			driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
		}

		// java script click
		public static void js_click(WebElement ck) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", ck);
			

		}
		
		
		
		public static void js_scroll( WebElement ct , String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].setAttribute('value', arguments[1])", ct, value);
			
		}

		// GetFirstSelectedOPtion
		public static void getfirstselectedoption(WebElement e) {
			Select select = new Select(e);
			WebElement option = select.getFirstSelectedOption();
			String s = option.getText();
			System.out.println(s);

		}

		// GetallSelected options

		public static void getallselectedoption(WebElement e) {
			Select select = new Select(e);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement s : allSelectedOptions) {
				System.out.println(s.getText());
			}
		}
		// ismultiple

		public static void ismultiple(WebElement element) {
			Select s = new Select(element);
			System.out.println(s.isMultiple());
		}

		// RadioButton

		public static void radiobutton(WebElement Element) {
			Element.click();
		}

		// checkBox

		public static void checkbox(WebElement Element) {
			Element.click();
		}
		
		// wait method
		public static void waitmethod1(int t, String xpath ) {
		
			 WebDriverWait wait = new WebDriverWait(driver, t);
	            List<WebElement> productList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("xpath") ));

	            // Get the count of elements
	            int count = productList.size();
	            System.out.println("Number of elements present: " + count);
		
		}
		

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


