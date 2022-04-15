import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstscript {
	
	public static void main(String[] args) throws InterruptedException
	{
		//Basics of Java
		/*System.out.println("Hello");
		int n =3;
		double d = 5.44;
		String s = "Jayasree";
		System.out.println(n);
		System.out.println(d);
		System.out.println(s);
		System.out.println("My name is:"+s);*/
		
		//Setting up of 1.chrome driver - key 2.value -path to chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\eclipse-workspace\\drivers\\chromedriver_win32 (8)\\chromedriver.exe");
	    //creating object for chromedriver class
		WebDriver driver = new ChromeDriver();
		//launching URL using get method
	    driver.get("http://automationpractice.com");
	    //maximize the window
	    driver.manage().window().maximize();
	    //1.Identify the WebElement using ID locator
	   // WebElement searchbox =driver.findElement(By.id("search_query_top"));
	    //searchbox.sendKeys("shirt");
	    //2.Identify the Webelement using name locator
	    //WebElement searchbox =driver.findElement(By.name("search_query"));
	    //searchbox.sendKeys("shirt")
	    //3.Identify the Webelement using class locator -- issue no such element
	    //WebElement searchbox =driver.findElement(By.className("search_query form-control ac_input"));
	    //searchbox.sendKeys("shirt");
	    // 4.Identify the Webelement using xpath locator
	    //WebElement searchbox =driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
	    //searchbox.sendKeys("shirt");
	    //5.Identify the webelement using css selector (tagname#id)
	   // WebElement searchbox =driver.findElement(By.cssSelector("input#search_query_top"));
	    //searchbox.sendKeys("shirt");
	    //CSS Selector (tagname[attribute= value])
	    WebElement searchbox =driver.findElement(By.cssSelector("input[id='search_query_top']"));
	   searchbox.sendKeys("shirt");
	    
	    //clicking on search button icon with name as locator
	   // WebElement button =driver.findElement(By.name("submit_search"));
	   // button.click();
	    //clicking on search button icon with xpath as locator
	    WebElement button =driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
	    button.click();
	    //Clicking on the image 
	    WebElement image = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	    image.click();
	   // Thread.sleep(2000);
	    
	    //Selecting quantity -- 9
	    WebElement quantity = driver.findElement(By.id("quantity_wanted"));
	    quantity.clear();
	    quantity.sendKeys("9");
	   
	    //Selecting size - L
	  //  WebElement size =  driver.findElement(By.id("group_1"));
	     WebElement size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
	     Select s1 = new Select(size);
	   /* s1.selectByIndex(0);
	    Thread.sleep(2000);
	    s1.selectByValue("2");
	    Thread.sleep(2000);*/
	    s1.selectByVisibleText("L");
	    
	   //Select color = blue
	    WebElement color = driver.findElement(By.xpath("//*[@id=\"color_14\"]"));
	    color.click();
	    
	    
	   //Clicking on Add to  cart
	    WebElement addtocart =driver.findElement(By.xpath("//span[text()='Add to cart']"));
	    addtocart.click();
	    
	    //Getting the displayed message 
	    Thread.sleep(2000);
	    WebElement message  = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
	    String m =   message.getText();
	    System.out.println(m);
	    if(m.equals("Product added to your shopping cart"))
	    	System.out.println("Passed");
	    else {
			System.out.println("Failed"); 		}
	   // System.out.println(m);
	    //Clicking on Proceed to Checkout
		/*Thread.sleep(2000);
	    WebElement proceed =driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	    proceed.click();*/
	    
	    //Clicking on delete
	   // WebElement remove = driver.findElement(By.xpath("//*[@id=\"1_1_0_0\"]/i"));
	    //remove.click();
	    //Closing the browser
	   // driver.close();
	    
	    
	    

		
		
	}

}
