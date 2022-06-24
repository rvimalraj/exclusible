package Beta;




import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class Exclusible_Footerlinks {
public static final String USERNAME = "vimalraj_1gakLz";
public static final String AUTOMATE_KEY = "papYajrttD3oH8zqqAjq";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

public static void main(String[] args) throws Exception {

	
		DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os", "Windows");
	caps.setCapability("os_version", "11");
	caps.setCapability("browser", "Chrome");
	caps.setCapability("browser_version", "latest");
	caps.setCapability("project", "Exclusible");
	caps.setCapability("build", "Win_Chrome");
	caps.setCapability("name", "Beta Exclusible_FooterLinks");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("browserstack.debug", "true");
	caps.setCapability("browserstack.networkLogs", "true");
	caps.setCapability("browserstack.selenium_version", "4.0.0");
	caps.setCapability("browserstack.idleTimeout", "<30>");
	
	
	


		//Running in Windows Edge
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "11");
//		caps.setCapability("browser", "Edge");
//		caps.setCapability("browser_version", "latest-beta");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Win_Edge");
//		caps.setCapability("name", "Beta Exclusible_FooterLinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");
//		caps.setCapability("browserstack.idleTimeout", "<30>");
//		
		
		//Running in Windows Firefox
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "11");
//		caps.setCapability("browser", "Firefox");
//		caps.setCapability("browser_version", "latest-beta");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Win_Firefox");
//		caps.setCapability("name", "Beta Exclusible_FooterLinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");
//		caps.setCapability("browserstack.idleTimeout", "<30>");

		//Running in OS X Monterey (Safari)
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "OS X");
//		caps.setCapability("os_version", "Monterey");
//		caps.setCapability("browser", "Safari");
//		caps.setCapability("browser_version", "15.3");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Monterey_Safari");
//		caps.setCapability("name", "Beta Exclusible_FooterLinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");
//		caps.setCapability("browserstack.safari.enablePopups", "true");
//		caps.setCapability("browserstack.safari.allowAllCookies", "true");
		
		//Running in OS X Monterey (Chrome)
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "OS X");
//		caps.setCapability("os_version", "Monterey");
//		caps.setCapability("browser", "Chrome");
//		caps.setCapability("browser_version", "latest-beta");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Monterey_Chrome");
//		caps.setCapability("name", "Beta Exclusible_FooterLinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");

	      //Running in OS X Monterey (Firefox)
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "OS X");
//		caps.setCapability("os_version", "Monterey");
//		caps.setCapability("browser", "Firefox");
//		caps.setCapability("browser_version", "latest-beta");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Monterey_Firefox");
//		caps.setCapability("name", "Beta Exclusible_FooterLinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");
		
		//Running in Monterey Edge
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "OS X");
//		caps.setCapability("os_version", "Monterey");
//		caps.setCapability("browser", "Edge");
//		caps.setCapability("browser_version", "latest-beta");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Monterey_Edge");
//		caps.setCapability("name", "Beta Exclusible_FooterLinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");

       WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       

        
	//footer link contact us 
		
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement contact = driver.findElement(By.xpath("//h6[@class='styled__To-sc-19j5jlu-4 gsJgsG']"));
		jse.executeScript("arguments[0].scrollIntoView();",contact);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[@class='styled__To-sc-19j5jlu-4 gsJgsG']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
//        driver.quit();
		
		//footer link work with us
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement work = driver.findElement(By.xpath("//h6[text()='Work with us']"));
		js2.executeScript("arguments[0].scrollIntoView();",work);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[text()='Work with us']")).click();
		Thread.sleep(4000);
	    Set<String> windowHandles2 = driver.getWindowHandles();
        System.out.println(windowHandles2);
        List<String> list = new ArrayList<String>(windowHandles2);
	    driver.switchTo().window(list.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(list.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());		
//        driver.quit();
		
		//footer link Team
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement team = driver.findElement(By.xpath("//h6[text()='Team']"));
		js3.executeScript("arguments[0].scrollIntoView();",team);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[text()='Team']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
//        driver.quit();
        
        //footer link about
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		WebElement about = driver.findElement(By.xpath("//h6[text()='About']"));
		js4.executeScript("arguments[0].scrollIntoView();",about);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[text()='About']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
//        driver.quit();
//        
        //footer link terms of use
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		WebElement terms = driver.findElement(By.xpath("//h6[text()=' Terms of Use ']"));
		js5.executeScript("arguments[0].scrollIntoView();",terms);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[text()=' Terms of Use ']")).click();
		Thread.sleep(4000);
	    Set<String> windowHandles3 = driver.getWindowHandles();
        System.out.println(windowHandles3);
        List<String> liste = new ArrayList<String>(windowHandles3);
	    driver.switchTo().window(liste.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(liste.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());		
//        driver.quit();
		
		//footer privacy
		
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		WebElement privacy = driver.findElement(By.xpath("//h6[text()=' Privacy ']"));
		js6.executeScript("arguments[0].scrollIntoView();",privacy);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[text()=' Privacy ']")).click();
		Thread.sleep(4000);
	    Set<String> windowHandles4 = driver.getWindowHandles();
        System.out.println(windowHandles4);
        List<String> listw = new ArrayList<String>(windowHandles4);
	    driver.switchTo().window(listw.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(listw.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());		
//        driver.quit();
        
        //footer support
		
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
		WebElement support = driver.findElement(By.xpath("//h6[text()='Support']"));
		js7.executeScript("arguments[0].scrollIntoView();",support);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h6[text()='Support']")).click();
		Thread.sleep(4000);
	    Set<String> windowHandles5 = driver.getWindowHandles();
        System.out.println(windowHandles5);
        List<String> listq = new ArrayList<String>(windowHandles5);
	    driver.switchTo().window(listq.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(listq.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());		


      			
        

       
        if (driver.getTitle().equals("Exclusible | Premium NFT platform for luxury digital collectible assets")) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
          }
          else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case failed\"}}");
          }
      
       
     

       
       
       
        driver.quit();
}
}

