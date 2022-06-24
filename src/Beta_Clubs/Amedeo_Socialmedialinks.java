package Beta_Clubs;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



@SuppressWarnings("unused")
public class Amedeo_Socialmedialinks {
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
	caps.setCapability("name", "Amedeo_Socialmedialinks");
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
//		caps.setCapability("name", "Amedeo_Socialmedialinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.networkLogs", "true");
//	    caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");
//		caps.setCapability("browserstack.idleTimeout", "<30>");
		
		
		//Running in Windows Firefox
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "11");
//		caps.setCapability("browser", "Firefox");
//		caps.setCapability("browser_version", "latest-beta");
//		caps.setCapability("project", "Exclusible");
//		caps.setCapability("build", "Win_Firefox");
//		caps.setCapability("name", "Amedeo_Socialmedialinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.networkLogs", "true");
//	    caps.setCapability("browserstack.debug", "true");
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
//		caps.setCapability("name", "Amedeo_Socialmedialinks");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.networkLogs", "true");
//	    caps.setCapability("browserstack.debug", "true");
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
//		caps.setCapability("name", "Amedeo_Socialmedialinks");
//		caps.setCapability("browserstack.local", "false");
//	    caps.setCapability("browserstack.debug", "true");
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
//		caps.setCapability("name", "Amedeo_Socialmedialinks");
//		caps.setCapability("browserstack.local", "false");
//	    caps.setCapability("browserstack.debug", "true");
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
//		caps.setCapability("name", "Amedeo_Socialmedialinks");
//		caps.setCapability("browserstack.local", "false");
//	    caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");
	

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("https://beta.exclusible.xyz/clubs");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Exclusible | Clubs"));
        
        driver.findElement(By.xpath("//a[text()='clubs']")).click();
	     Thread.sleep(6000);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //This will scroll the page till the element is found
	     
	     WebElement Element = driver.findElement(By.xpath("(//img[@alt='brand-logo'])[7]"));
	     jse.executeScript("arguments[0].scrollIntoView();", Element);
			
	     driver.findElement(By.xpath("(//img[@alt='brand-logo'])[8]")).click(); // @Amedeo Club
	     Thread.sleep(5000);
	     

	        driver.findElement(By.xpath("//img[@alt='icon'][1]")).click(); // @Amedeo Instagram Link
	        driver.getTitle();
	        Thread.sleep(3000);
	        Set<String> windowHandlesi = driver.getWindowHandles();
	        System.out.println(windowHandlesi);
	        List<String> listi = new ArrayList<String>(windowHandlesi);
		    driver.switchTo().window(listi.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(3000);
	        driver.close();
	        driver.switchTo().window(listi.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		      
	        Thread.sleep(3000);
	        
	       
			
	        driver.findElement(By.xpath("//img[@alt='icon'][2]")).click(); // @Amedeo Facebook Link
	        driver.getTitle();
	        Thread.sleep(7000);
	        Set<String> windowHandlesf = driver.getWindowHandles();
	        System.out.println(windowHandlesf);
	        List<String> listf = new ArrayList<String>(windowHandlesf);
		    driver.switchTo().window(listf.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(listf.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());	
	        Thread.sleep(3000);
	        
	        

	        driver.findElement(By.xpath("//img[@alt='icon'][3]")).click(); // @Amedeo Twitter Link
	        driver.getTitle();
	        Thread.sleep(7000);
	        Set<String> windowHandlest = driver.getWindowHandles();
	        System.out.println(windowHandlest);
	        List<String> listg = new ArrayList<String>(windowHandlest);
		    driver.switchTo().window(listg.get(1));
		    System.out.println(driver.getCurrentUrl());
	        Thread.sleep(3000);
	        driver.close();
	        driver.switchTo().window(listg.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());
	        Thread.sleep(3000);
	       
	        
	        System.out.println("Page title is : " + driver.getTitle());
       
        
        System.out.println("Page title is : " + driver.getTitle());
        if (driver.getTitle().equals("Amedeo | Exclusible")) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
          }
          else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case Failed to Load\"}}");
          }
      

       

        driver.quit();
}
}