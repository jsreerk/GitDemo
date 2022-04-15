

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PageLocator {
	
	static WebDriver driver; 
	WebElement lastnamElement;
	String lnString;
	
	public WebDriver createDriver()  //DO NOT change the method signature
	{
		//DriverSetup ds = new DriverSetup();
		driver = DriverSetup.getWebDriver();
		return driver;
	   //Invoke getWebDriver method from DriverSetup and return it
	}
	
	public WebElement getPageLocator(WebDriver driver2)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the WebElement of 'Lastname'*/
	   /*Find the element by id */
		lastnamElement = driver2.findElement(By.id("lastname"));
		return lastnamElement;
    
	}
	public String getName(WebElement element)  //DO NOT change the method signature
	{
		//Get the attribute value from the element and return it
		
		lnString = lastnamElement.getAttribute("placeholder");
		return lnString;
	    
	}
	
	public static void main(String[] args){
	    PageLocator pl=new PageLocator();
	    //Add required code
	    pl.createDriver();
	    pl.getPageLocator(driver);
	    WebElement element = null;
		String l=  pl.getName(element);
		System.out.println(l);
		
		
	    
	}
	

	

}
