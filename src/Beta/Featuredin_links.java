
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
	caps.setCapability("name", "FeaturedIn_links");
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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("(//img[@target='_blank'])[1]")).click();// Fashion United Link
        Thread.sleep(5000);
        Set<String> windowHandles1 = driver.getWindowHandles();
        System.out.println(windowHandles1);
        List<String> list1 = new ArrayList<String>(windowHandles1);
        driver.switchTo().window(list1.get(1));
        driver.close();
        driver.switchTo().window(list1.get(0));
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//img[@target='_blank'])[2]")).click();// Forbes Link
        Thread.sleep(5000);
        Set<String> windowHandles2 = driver.getWindowHandles();
        System.out.println(windowHandles2);
        List<String> list2 = new ArrayList<String>(windowHandles2);
        driver.switchTo().window(list2.get(1));
        driver.close();
        driver.switchTo().window(list2.get(0));
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
       
        
        driver.findElement(By.xpath("(//img[@target='_blank'])[3]")).click();// Vougue Business
        Thread.sleep(7000);
        Set<String> windowHandles3 = driver.getWindowHandles();
        System.out.println(windowHandles3);
        List<String> list3 = new ArrayList<String>(windowHandles3);
        driver.switchTo().window(list3.get(1));
        driver.close();
        driver.switchTo().window(list3.get(0));
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//img[@target='_blank'])[4]")).click();// Coin News Link
        Thread.sleep(7000);
        Set<String> windowHandles4 = driver.getWindowHandles();
        System.out.println(windowHandles4);
        List<String> list4 = new ArrayList<String>(windowHandles4);
        driver.switchTo().window(list4.get(1));
        driver.close();
        driver.switchTo().window(list4.get(0));
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);

        
       
        
        driver.findElement(By.xpath("(//img[@target='_blank'])[5]")).click();// Crypto News Link
        Thread.sleep(7000);
        Set<String> windowHandles5 = driver.getWindowHandles();
        System.out.println(windowHandles5);
        List<String> list5 = new ArrayList<String>(windowHandles5);
        driver.switchTo().window(list5.get(1));
        driver.close();
        driver.switchTo().window(list5.get(0));
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("(//img[@target='_blank'])[6]")).click();// Glossy Link
        Thread.sleep(7000);
        Set<String> windowHandles6 = driver.getWindowHandles();
        System.out.println(windowHandles6);
        List<String> list6 = new ArrayList<String>(windowHandles6);
        driver.switchTo().window(list6.get(1));
        driver.close();
        driver.switchTo().window(list6.get(0));
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(9000);
        
        
      driver.findElement(By.xpath("(//img[@target='_blank'])[7]")).click();// Journal Du Coin
      
      Thread.sleep(9000);
      Set<String> windowHandles7 = driver.getWindowHandles();
      System.out.println(windowHandles7);
      List<String> list7 = new ArrayList<String>(windowHandles7);
      driver.switchTo().window(list7.get(1));
      driver.close();
      driver.switchTo().window(list7.get(0));
      Thread.sleep(4000);
      jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
      Thread.sleep(9000);
      
      
      driver.findElement(By.xpath("(//img[@target='_blank'])[8]")).click();// New York Post Link
      Thread.sleep(7000);
      Set<String> windowHandles8 = driver.getWindowHandles();
      System.out.println(windowHandles8);
      List<String> list8 = new ArrayList<String>(windowHandles8);
      driver.switchTo().window(list8.get(1));
      driver.close();
      driver.switchTo().window(list8.get(0));
      Thread.sleep(4000);
      jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("(//img[@target='_blank'])[9]")).click();// NFT Evening
      Thread.sleep(7000);
      Set<String> windowHandles9 = driver.getWindowHandles();
      System.out.println(windowHandles9);
      List<String> list9 = new ArrayList<String>(windowHandles9);
      driver.switchTo().window(list9.get(1));
      driver.close();
      driver.switchTo().window(list9.get(0));
      Thread.sleep(4000);
      jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("(//img[@target='_blank'])[10]")).click();// Vougue Business
      Set<String> windowHandles10 = driver.getWindowHandles();
      System.out.println(windowHandles10);
      List<String> list10 = new ArrayList<String>(windowHandles10);
      driver.switchTo().window(list10.get(1));
      driver.close();
      driver.switchTo().window(list10.get(0));
      Thread.sleep(4000);
      jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
      Thread.sleep(9000);
        
      
      driver.findElement(By.xpath("(//img[@target='_blank'])[11]")).click();// Jing Daily
      Thread.sleep(7000);
      Set<String> windowHandles11 = driver.getWindowHandles();
      System.out.println(windowHandles11);
      List<String> list11 = new ArrayList<String>(windowHandles11);
      driver.switchTo().window(list11.get(1));
      driver.close();
      driver.switchTo().window(list11.get(0));
      Thread.sleep(4000);
      jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
      Thread.sleep(9000);
      
      

        System.out.println("Page title is : " + driver.getTitle());
        if (driver.getTitle().equals("Exclusible | Premium NFT platform for luxury digital collectible assets")) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
          }
          else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case failed\"}}");
          }
      
       
     

        Thread.sleep(3000);
      
       
       
       
        driver.quit();
}
}

