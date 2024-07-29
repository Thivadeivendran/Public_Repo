import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filter_Addtocart {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\eclipse-workspace\\Task\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Actions a=new Actions(driver);
		
	    WebElement fashion=driver.findElement(By.xpath("//a[text()='Fashion']"));
	    fashion.click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@aria-label='Men, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click();
	    
	    WebElement custreview = driver.findElement(By.xpath("//span[text()='Avg. Customer Review']"));
	     js=(JavascriptExecutor) driver;
	    Thread.sleep(2000);
	    
	    js.executeScript("arguments[0].scrollIntoView();",custreview);
	    
	    WebElement Fourstarsandup = driver.findElement(By.xpath("//div[@aria-label='4 Stars & Up']"));
	    Fourstarsandup.click();
	    
	    WebElement pricerange = driver.findElement(By.xpath("//span[text()='Price']"));
//	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", pricerange);
	    
	    Thread.sleep(5000);
	    
	    WebElement min = driver.findElement(By.xpath("//input[@name='low-price']"));
//	    JavascriptExecutor js2=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value', '1000')", min);
	    
	    Thread.sleep(5000);
	    
	    WebElement max = driver.findElement(By.xpath("//input[@name='high-price']"));
//	    JavascriptExecutor js3=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value', '5000')", max);
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[text()='Go']/../../input")).click();
	    Thread.sleep(5000);
	    System.out.println("Filter successfully");
	    
	    
	    WebElement Allensolley = driver.findElement(By.xpath("//span[text()='Allen Solly']"));
	    Allensolley.click();
	    System.out.println("Allen solley");
	    Thread.sleep(5000);
	    WebElement puma = driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='Puma']"));
	    puma.click();
	    System.out.println("Puma");
	    Thread.sleep(5000); 
	  
	    
	   List<WebElement> numberofelements = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base a-text-center']"));
	   System.out.println("Total number of elements in firstpaga:"+numberofelements.size());
	   
	   WebElement Seconditem=driver.findElement(By.xpath("//img[@data-image-index='2']"));
	   Seconditem.click();
	   
	   Thread.sleep(10000);
	   
	   Set<String> windowHandles = driver.getWindowHandles();
	   System.out.println(windowHandles);
	   for (String string : windowHandles) {
		   String title = driver.switchTo().window(string).getTitle();
		   System.out.println(title);
		
	}
	   
	   WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']//parent::span"));
	   addtocart.click();
	   System.out.println("Added to cart");
	   
	   WebElement clickcart = driver.findElement(By.xpath("//div[@id='nav-cart-text-container']/child::span[@class='nav-line-2']"));
	   clickcart.click();
	   
	   WebElement quantity = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
	   String quantityvalue = quantity.getText();
	   System.out.println("value in cart:"+quantityvalue);
	   int value=Integer.parseInt(quantityvalue);
	   
	   if(value==1) {
		   System.out.println("cart added by 1");
	   }
	   else
	   {
		   System.out.println("item not added to cart");
	   }
	   
	   
	   
	  
	 //div[@class='a-box-inner']/following::span[text()='Add to Cart'
	   
			   
			 //div[@class='a-section a-spacing-base a-text-center']/following::div[@data-uuid="963d558a-61b5-4922-ba63-f5d83335ae60"]
	   
	   
//	   Dimension size = numberofelements.size();
//	   String text = numberofelements.getText();
//	   System.out.println(size);
//	   System.out.println(text);
//	    
	    
	   
	 //*[@id="submit.add-to-cart-announce"]
	}

}

