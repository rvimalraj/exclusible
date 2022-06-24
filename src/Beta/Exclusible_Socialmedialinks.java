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
public class Exclusible_Socialmedialinks {
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
	caps.setCapability("name", "Footer_Socialmedialinks");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("browserstack.debug", "true");
	caps.setCapability("browserstack.networkLogs", "true");
	caps.setCapability("browserstack.selenium_version", "4.0.0");
	caps.setCapability("browserstack.idleTimeout", "<30>");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://beta.exclusible.xyz"); // Launching Website
        Thread.sleep(3000);
        driver.manage().window().maximize();

      //footer discord
		
      		JavascriptExecutor js8 = (JavascriptExecutor) driver;
      		WebElement discord = driver.findElement(By.xpath("(//img[@target='_blank'])[12]"));
      		js8.executeScript("arguments[0].scrollIntoView();",discord);
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//img[@target='_blank'])[12]")).click();
      		Thread.sleep(4000);
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

      //footer youtube
      		
      		JavascriptExecutor js9 = (JavascriptExecutor) driver;
      		WebElement youtube = driver.findElement(By.xpath("(//img[@target='_blank'])[13]"));
      		js9.executeScript("arguments[0].scrollIntoView();",youtube);
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//img[@target='_blank'])[13]")).click();
      		Thread.sleep(4000);
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

      	//footer instagram
      		
      		JavascriptExecutor js1a = (JavascriptExecutor) driver;
      		WebElement insta = driver.findElement(By.xpath("(//img[@target='_blank'])[14]"));
      		js1a.executeScript("arguments[0].scrollIntoView();",insta);
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//img[@target='_blank'])[14]")).click();
      		Thread.sleep(4000);
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

      //footer linked in 
      		
              JavascriptExecutor js1b = (JavascriptExecutor) driver;
      		WebElement in = driver.findElement(By.xpath("(//img[@target='_blank'])[15]"));
      		js1b.executeScript("arguments[0].scrollIntoView();",in);
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//img[@target='_blank'])[15]")).click();
      		Thread.sleep(4000);
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
            

       //footer twitter
      		
              JavascriptExecutor js1c = (JavascriptExecutor) driver;
      		WebElement twitter = driver.findElement(By.xpath("(//img[@target='_blank'])[16]"));
      		js1c.executeScript("arguments[0].scrollIntoView();",twitter);
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//img[@target='_blank'])[16]")).click();
      		Thread.sleep(4000);
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
              
              
              if (driver.getTitle().equals("Exclusible | Premium NFT platform for luxury digital collectible assets")) {
                  jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
                }
                else {
                  jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case failed\"}}");
                }
              
              
             

             
             
             
              driver.quit();
      }
      }


