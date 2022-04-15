import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setting up of driver instance & path for the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\eclipse-workspace\\drivers\\chromedriver_win32 (11)\\chromedriver.exe");
		
	    //creating object for chromedriver class
		WebDriver driver = new ChromeDriver();
		
		//launching URL using get method
	    driver.get("http://automationpractice.com");
	    
	    //maximize the window
	    driver.manage().window().maximize();
	    
	    //Clicking on "Contatct us"
	    WebElement contact = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
	    contact.click();
	    
	    //Clicking on send to capture error message 
	    WebElement send = driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span"));
	    send.click();
	    
	    
	    //Getting the error message to display on console
	    WebElement message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
	    String error = message.getText();
	    System.out.println(error);
	    if(error.equals("There is 1 error"))
	    	System.out.println("Passed");
	    else {
			System.out.println("Failed");
		}
	    
	    //Selecting drop down == "Webmaster"
	    WebElement sel = driver.findElement(By.id("id_contact"));
	    Select s1 = new Select(sel);
	    s1.selectByValue("1");
	    
	    //Entering email address
	    WebElement mail = driver.findElement(By.id("email"));
	    mail.sendKeys("asdf@gmail.com");
	    
	    //Entering message in the text area
	    WebElement msg = driver.findElement(By.id("message"));
	    msg.sendKeys("Hello text for test");
	    
	    //Clicking send again	    
	   WebElement sendagain = driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span"));
	    sendagain.click();
	    
	    //Validating succcess message 
	    WebElement smsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	     String smessage =  smsg.getText();
	     System.out.println(smessage);
	     if(smessage.equals("Your message has been successfully sent  our team."))
			System.out.println("Passed");
			else {
				System.out.println("Failed");
			}
	     driver.quit();
	     
	    
	    
	}

}
