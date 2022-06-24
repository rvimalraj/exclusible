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
public class Exclusible_Headerlinks {
public static final String USERNAME = "vimalraj_1gakLz";
public static final String AUTOMATE_KEY = "papYajrttD3oH8zqqAjq";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

public static void main(String[] args) throws Exception {
	
	//Running in Windoes Chrome
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os", "Windows");
	caps.setCapability("os_version", "11");
	caps.setCapability("browser", "Chrome");
	caps.setCapability("browser_version", "latest");
	caps.setCapability("project", "Exclusible");
	caps.setCapability("build", "Win_Chrome");
	caps.setCapability("name", "Exclusible_Headerlinks");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("browserstack.debug", "true");
	caps.setCapability("browserstack.networkLogs", "true");
	caps.setCapability("browserstack.selenium_version", "4.0.0");
	caps.setCapability("browserstack.idleTimeout", "<30>");


	//Running in Windows Edge
	
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "Windows");
//	caps.setCapability("os_version", "11");
//	caps.setCapability("browser", "Edge");
//	caps.setCapability("browser_version", "latest-beta");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Win_Edge");
//	caps.setCapability("name", "Exclusible_Headerlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");
//	caps.setCapability("browserstack.idleTimeout", "<30>");
	
	
	//Running in Windows Firefox
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "Windows");
//	caps.setCapability("os_version", "11");
//	caps.setCapability("browser", "Firefox");
//	caps.setCapability("browser_version", "latest-beta");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Win_Firefox");
//	caps.setCapability("name", "Exclusible_Headerlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");
//	caps.setCapability("browserstack.idleTimeout", "<30>");

	//Running in OS X Monterey (Safari)
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "OS X");
//	caps.setCapability("os_version", "Monterey");
//	caps.setCapability("browser", "Safari");
//	caps.setCapability("browser_version", "15.3");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Monterey_Safari");
//	caps.setCapability("name", "Exclusible_Headerlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");
//	caps.setCapability("browserstack.safari.enablePopups", "true");
//	caps.setCapability("browserstack.safari.allowAllCookies", "true");
	
	//Running in OS X Monterey (Chrome)
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "OS X");
//	caps.setCapability("os_version", "Monterey");
//	caps.setCapability("browser", "Chrome");
//	caps.setCapability("browser_version", "latest-beta");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Monterey_Chrome");
//	caps.setCapability("name", "Exclusible_Headerlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");

      //Running in OS X Monterey (Firefox)
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "OS X");
//	caps.setCapability("os_version", "Monterey");
//	caps.setCapability("browser", "Firefox");
//	caps.setCapability("browser_version", "latest-beta");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Monterey_Firefox");
//	caps.setCapability("name", "Exclusible_Headerlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");
	
	//Running in Monterey Edge
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "OS X");
//	caps.setCapability("os_version", "Monterey");
//	caps.setCapability("browser", "Edge");
//	caps.setCapability("browser_version", "latest-beta");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Monterey_Edge");
//	caps.setCapability("name", "Exclusible_Headerlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");



        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://beta.exclusible.xyz"); // Launching Website
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
        
      //header links upcoming
        driver.findElement(By.xpath("//a[text()='Upcoming']")).click();
         Thread.sleep(3000);
         System.out.println("clicked upcoming");
         driver.navigate().back();
         Thread.sleep(5000);
         
         // header link clubs
         driver.findElement(By.xpath("//a[text()='clubs']")).click();
         Thread.sleep(9000);
         System.out.println("clicked clubs");
         driver.navigate().back();
         Thread.sleep(5000);
       
         //header link metaverse
 		
         driver.findElement(By.xpath("//a[text()='Metaverse']")).click();
         Thread.sleep(9000);
         //window handling
         Set<String> windowHandles = driver.getWindowHandles();
         System.out.println(windowHandles);
         List<String> list = new ArrayList<String>(windowHandles);
         driver.switchTo().window(list.get(1));
         System.out.println(driver.getCurrentUrl());
         Thread.sleep(5000);
         driver.close();
         driver.switchTo().window(list.get(0));
         System.out.println(driver.getCurrentUrl());
         Thread.sleep(5000);
      
        
         //header link join community
  	   
         driver.findElement(By.xpath("//li[text()='Join community']")).click();
         Thread.sleep(9000);
         //window handling
         Set<String> windowHandles1 = driver.getWindowHandles();
         System.out.println(windowHandles1);
         List<String> list1 = new ArrayList<String>(windowHandles1);
         driver.switchTo().window(list1.get(1));
         System.out.println(driver.getCurrentUrl());
         Thread.sleep(5000);
         driver.close();
         driver.switchTo().window(list.get(0));
         System.out.println(driver.getCurrentUrl());
         Thread.sleep(5000);
    
        
         if (driver.getTitle().equals("Exclusible | Premium NFT platform for luxury digital collectible assets")) {
             jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
           }
           else {
             jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case failed\"}}");
           }
         
         
        

        
        
        
         driver.quit();
 }
 }


