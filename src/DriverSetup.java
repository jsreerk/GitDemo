

/* IMPORTANT:- DriverSetup --getDriver()
-------------------------------------------------
PLEASE DO NOT MAKE ANY CHANGES OR MOFICATIONS IN THIS PROGRAM */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DriverSetup
{ 
    private static WebDriver driver;
    public  static WebDriver getWebDriver()
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\eclipse-workspace\\drivers\\chromedriver_win32 (11)\\chromedriver.exe");
	    driver= new ChromeDriver();
	    String baseUrl = "http://webapps.tekstac.com/Shopify/";
	     driver.get(baseUrl);
	    return driver;
	}
}




