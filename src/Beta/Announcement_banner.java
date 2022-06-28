package Beta;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class Announcement_banner {
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
	caps.setCapability("name", "Announcement_Banner");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("browserstack.debug", "true");
	caps.setCapability("browserstack.networkLogs", "true");
	caps.setCapability("browserstack.selenium_version", "4.0.0");
	caps.setCapability("browserstack.idleTimeout", "<30>");


        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://beta.exclusible.xyz");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Exclusible | Premium NFT platform for luxury digital collectible assets"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/p/span")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        
		
        System.out.println("Page title is : " + driver.getTitle());
        if (driver.getTitle().equals("Exclusible | Premium NFT platform for luxury digital collectible assets")) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
          }
          else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Some Test Case Failed to Load\"}}");
          }
      

       

        driver.quit();
}
}