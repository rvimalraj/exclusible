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
public class Featuredin_links {
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
	caps.setCapability("name", "Exclusible_Featuredinlinks");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("browserstack.debug", "true");
	caps.setCapability("browserstack.networkLogs", "true");
	caps.setCapability("browserstack.selenium_version", "4.0.0");
	caps.setCapability("browserstack.idleTimeout", "<30>");
	
	
//	DesiredCapabilities caps = new DesiredCapabilities();
//	caps.setCapability("os", "Windows");
//	caps.setCapability("os_version", "11");
//	caps.setCapability("browser", "Edge");
//	caps.setCapability("browser_version", "latest-beta");
//	caps.setCapability("project", "Exclusible");
//	caps.setCapability("build", "Win_Edge");
//	caps.setCapability("name", "Exclusible_Featuredinlinks");
//	caps.setCapability("browserstack.local", "false");
//	caps.setCapability("browserstack.networkLogs", "true");
//	caps.setCapability("browserstack.selenium_version", "4.0.0");
//	caps.setCapability("browserstack.idleTimeout", "<30>");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://beta.exclusible.xyz"); // Launching Website
        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement Element = driver.findElement(By.xpath("//h3[text()='Featured in']"));

        //This will scroll the page till the element is found		
        jse.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
        
    	//fashion united
		
		  JavascriptExecutor js1d = (JavascriptExecutor) driver;
			WebElement fashion = driver.findElement(By.xpath("(//img[@target='_blank'])[1]"));
			js1d.executeScript("arguments[0].scrollIntoView();",fashion);
			Thread.sleep(4000);
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[1]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[1]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1b = driver.getWindowHandles();
	        System.out.println(windowHandles1b);
	        List<String> list = new ArrayList<String>(windowHandles1b);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	       


//forbes
		  
		  JavascriptExecutor js1e = (JavascriptExecutor) driver;
			WebElement forbes = driver.findElement(By.xpath("(//img[@target='_blank'])[2]"));
			js1e.executeScript("arguments[0].scrollIntoView();",forbes);
			Thread.sleep(4000);
	        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[2]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[2]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1c = driver.getWindowHandles();
	        System.out.println(windowHandles1c);
	        List<String> list1 = new ArrayList<String>(windowHandles1c);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	     

	  //vogue
		  
		  JavascriptExecutor js1f = (JavascriptExecutor) driver;
			WebElement vogue = driver.findElement(By.xpath("(//img[@target='_blank'])[3]"));
			js1f.executeScript("arguments[0].scrollIntoView();",vogue);
			Thread.sleep(4000);
		    WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[3]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[3]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1d = driver.getWindowHandles();
	        System.out.println(windowHandles1d);
	        List<String> list2 = new ArrayList<String>(windowHandles1d);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	   

//coin news
		  
		  JavascriptExecutor js1g = (JavascriptExecutor) driver;
			WebElement coin = driver.findElement(By.xpath("(//img[@target='_blank'])[4]"));
			js1g.executeScript("arguments[0].scrollIntoView();",coin);
			Thread.sleep(4000);
			WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[4]")));	
			driver.findElement(By.xpath("(//img[@target='_blank'])[4]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1e = driver.getWindowHandles();
	        System.out.println(windowHandles1e);
	        List<String> list3 = new ArrayList<String>(windowHandles1e);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		


//crypto news
		  
		    JavascriptExecutor js1h = (JavascriptExecutor) driver;
			WebElement crypto = driver.findElement(By.xpath("(//img[@target='_blank'])[5]"));
			js1h.executeScript("arguments[0].scrollIntoView();",crypto);
			Thread.sleep(4000);
			 WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[5]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[5]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1f = driver.getWindowHandles();
	        System.out.println(windowHandles1f);
	        List<String> list4 = new ArrayList<String>(windowHandles1f);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	       
        

		  //glossy
		  
		    JavascriptExecutor js1i = (JavascriptExecutor) driver;
			WebElement glossy = driver.findElement(By.xpath("(//img[@target='_blank'])[6]"));
			js1i.executeScript("arguments[0].scrollIntoView();",glossy);
			Thread.sleep(4000);
		    WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[6]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[6]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1h = driver.getWindowHandles();
	        System.out.println(windowHandles1h);
	        List<String> list5 = new ArrayList<String>(windowHandles1h);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	        

//journal d coin
		  
		  JavascriptExecutor js1j = (JavascriptExecutor) driver;
			WebElement journal = driver.findElement(By.xpath("(//img[@target='_blank'])[7]"));
			js1j.executeScript("arguments[0].scrollIntoView();",journal);
			Thread.sleep(4000);
	        WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[7]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[7]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1i = driver.getWindowHandles();
	        System.out.println(windowHandles1i);
	        List<String> list6 = new ArrayList<String>(windowHandles1i);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	        

//new york post
		
		  JavascriptExecutor js1k = (JavascriptExecutor) driver;
			WebElement post = driver.findElement(By.xpath("(//img[@target='_blank'])[8]"));
			js1k.executeScript("arguments[0].scrollIntoView();",post);
			Thread.sleep(4000);
	        WebDriverWait wait7 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[8]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[8]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1j = driver.getWindowHandles();
	        System.out.println(windowHandles1j);
	        List<String> list7 = new ArrayList<String>(windowHandles1j);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	      

//nft evening
	        
		  JavascriptExecutor js1l = (JavascriptExecutor) driver;
			WebElement nft = driver.findElement(By.xpath("(//img[@target='_blank'])[9]"));
			js1l.executeScript("arguments[0].scrollIntoView();",nft);
			Thread.sleep(4000);
         WebDriverWait wait8 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[9]")));	        
			driver.findElement(By.xpath("(//img[@target='_blank'])[9]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1k = driver.getWindowHandles();
	        System.out.println(windowHandles1k);
	        List<String> list8 = new ArrayList<String>(windowHandles1k);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	     

//vogue business
		  
		  JavascriptExecutor js1m = (JavascriptExecutor) driver;
			WebElement business = driver.findElement(By.xpath("(//img[@target='_blank'])[10]"));
			js1m.executeScript("arguments[0].scrollIntoView();",business);
			Thread.sleep(4000);
	        WebDriverWait wait9 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[10]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[10]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1l = driver.getWindowHandles();
	        System.out.println(windowHandles1l);
	        List<String> list9 = new ArrayList<String>(windowHandles1l);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	      
//jing daily
		  
		  JavascriptExecutor js1n = (JavascriptExecutor) driver;
			WebElement daily = driver.findElement(By.xpath("(//img[@target='_blank'])[11]"));
			js1n.executeScript("arguments[0].scrollIntoView();",daily);
			Thread.sleep(4000);
	        WebDriverWait wait10 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@target='_blank'])[11]")));
			driver.findElement(By.xpath("(//img[@target='_blank'])[11]")).click();
			Thread.sleep(4000);
		    Set<String> windowHandles1n = driver.getWindowHandles();
	        System.out.println(windowHandles1n);
	        List<String> list10 = new ArrayList<String>(windowHandles1n);
		    driver.switchTo().window(list.get(1));
		    System.out.println(driver.getCurrentUrl());
		    Thread.sleep(5000);
	        driver.close();
	        driver.switchTo().window(list.get(0));
	        Thread.sleep(4000);
	        System.out.println(driver.getCurrentUrl());		
	        driver.quit();
}
}