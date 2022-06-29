package Beta_Upcoming;





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




@SuppressWarnings("unused")
public class NeverMissADrop {
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
	caps.setCapability("name", "Never Miss A Drop");
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
//		caps.setCapability("name", "Beta_Never Miss A Drop");
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
//		caps.setCapability("name", "Beta_Never Miss A Drop");
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
//		caps.setCapability("name", "Beta_Never Miss A Drop");
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
//		caps.setCapability("name", "Beta_Never Miss A Drop");
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
//		caps.setCapability("name", "Beta_Never Miss A Drop");
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
//		caps.setCapability("name", "Beta_Never Miss A Drop");
	
//		caps.setCapability("browserstack.local", "false");
//	    caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("https://beta.exclusible.xyz/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
       // driver.getTitle();
       ;
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Exclusible | Premium NFT platform for luxury digital collectible assets"));
		
        driver.findElement(By.xpath("//a[text()='Upcoming']")).click(); // Upcoming Module
        Thread.sleep(5000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");	       
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div/input")).sendKeys("testing@gmail.com");
        Thread.sleep(9000);
        driver.findElement(By.xpath("(//button[text()='Subscribe now'])[1]")).click();
        driver.getTitle();
        Thread.sleep(3000);
        
        
        System.out.println("Page title is : " + driver.getTitle());
        if (driver.getTitle().equals("Exclusible | Upcoming")) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
          }
          else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case Failed to Load\"}}");
          }
      

       

        driver.quit();
}
}