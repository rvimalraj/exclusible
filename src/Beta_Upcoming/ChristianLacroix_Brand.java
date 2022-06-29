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

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



@SuppressWarnings("unused")
public class ChristianLacroix_Brand {
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
	caps.setCapability("name", "Christian-Lacroix_Club");
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
//		caps.setCapability("name", "FrederiqueConstant_See Drop");
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
//		caps.setCapability("name", "FrederiqueConstant_See Drop");
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
//		caps.setCapability("name", "FrederiqueConstant_See Drop");
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
//		caps.setCapability("name", "FrederiqueConstant_See Drop");
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
//		caps.setCapability("name", "FrederiqueConstant_See Drop");
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
//		caps.setCapability("name", "FrederiqueConstant_See Drop");
//		caps.setCapability("browserstack.local", "false");
//	    caps.setCapability("browserstack.debug", "true");
//		caps.setCapability("browserstack.networkLogs", "true");
//		caps.setCapability("browserstack.selenium_version", "4.0.0");


        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        Robot robot = new Robot();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("https://beta.exclusible.xyz/");
        
        
        WebElement Element = driver.findElement(By.xpath("(//img[@alt='icon'])[1]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Exclusible | Premium NFT platform for luxury digital collectible assets"));
		
        driver.findElement(By.xpath("//a[text()='Upcoming']")).click(); // Upcoming Module
        Thread.sleep(5000);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        driver.findElement(By.xpath("//div[@class='styled__DropImage-sc-mm26e1-1 czammj']")).click(); // Malakai Image
        Thread.sleep(3000);
        driver.navigate().back();
        
        driver.findElement(By.xpath("(//button[text()='see Brand'])[2]")).click(); // @Malakai See Brand Button 
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//img[@alt='icon'])[1]")).click();
        Thread.sleep(5000);
        Set<String> windowHandles1 = driver.getWindowHandles();
        System.out.println(windowHandles1);
        List<String> list1 = new ArrayList<String>(windowHandles1);
	    driver.switchTo().window(list1.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(list1.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());	
        
        
        driver.findElement(By.xpath("(//img[@alt='icon'])[2]")).click();
        Thread.sleep(5000);
        Set<String> windowHandles2 = driver.getWindowHandles();
        System.out.println(windowHandles2);
        List<String> list2 = new ArrayList<String>(windowHandles2);
	    driver.switchTo().window(list2.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(list2.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());	
        
        driver.findElement(By.xpath("(//img[@alt='icon'])[3]")).click();
        Thread.sleep(5000);
        Set<String> windowHandles3 = driver.getWindowHandles();
        System.out.println(windowHandles3);
        List<String> list3 = new ArrayList<String>(windowHandles3);
	    driver.switchTo().window(list3.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(list3.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());	
        
        driver.findElement(By.xpath("(//img[@alt='icon'])[4]")).click();
        Thread.sleep(5000);
        Set<String> windowHandles4 = driver.getWindowHandles();
        System.out.println(windowHandles4);
        List<String> list4 = new ArrayList<String>(windowHandles4);
	    driver.switchTo().window(list4.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(list4.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());	
        
        driver.findElement(By.xpath("(//img[@alt='share icon'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='close icon']")).click();
        
        WebElement Element1 = driver.findElement(By.xpath("//div[@class='styled__Header-sc-1hzia41-1 kaJwrh']"));
        jse.executeScript("arguments[0].scrollIntoView();",Element1);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='See Drop']")).click(); // @Malakai See Drop Button 
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//p[text()='Christian Lacroix']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        
        driver.findElement(By.xpath("//img[@alt='brand logo']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement Element2 = driver.findElement(By.xpath("//h5[text()='Christian Lacroix']"));
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@class='styled__Sale-sc-1xqpn9x-7 dPdssz']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//h6[text()='Christian Lacroix']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//button[text()='Prepay']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='prepay with creditcard']")).click();
        Thread.sleep(3000);
        Set<String> windowHandles5 = driver.getWindowHandles();
        System.out.println(windowHandles5);
        List<String> list5 = new ArrayList<String>(windowHandles5);
	    driver.switchTo().window(list5.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(list5.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl());	
        driver.getTitle();
        Thread.sleep(7000);
       
       
        
        System.out.println("Page title is : " + driver.getTitle());
        if (driver.getTitle().equals("Reves de Soie | Exclusible")) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
          }
          else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case Failed to Load\"}}");
          }
      

       

        driver.quit();
}
}