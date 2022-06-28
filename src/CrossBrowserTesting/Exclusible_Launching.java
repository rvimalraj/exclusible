package CrossBrowserTesting;




import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Exclusible_Launching {
	public static final String USERNAME = "vimalraj_1gakLz";
	public static final String AUTOMATE_KEY = "papYajrttD3oH8zqqAjq";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws Exception {
		class DeviceOne implements Runnable {
			public void run() {
				Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
				capsHashtable.put("browserName", "Edge");
				capsHashtable.put("browserVersion", "latest-beta");
				capsHashtable.put("os", "Windows");
				capsHashtable.put("osVersion", "11");
				capsHashtable.put("browser", "Edge");
				capsHashtable.put("project", "Exclusible");
				capsHashtable.put("build", "Win_Edge");
				capsHashtable.put("name", "Exclusible_AnnouncementBanner");
				capsHashtable.put("browserstack.local", "false");
				capsHashtable.put("browserstack.debug", "true");
				capsHashtable.put("browserstack.networkLogs", "true");
				capsHashtable.put("browserstack.selenium_version", "4.0.0");
				capsHashtable.put("browserstack.idleTimeout", "<30>");
				Exclusible_Launching deviceOne = new Exclusible_Launching();
				deviceOne.executeTest(capsHashtable);
			}
		}
		class DeviceTwo implements Runnable {
			public void run() {
				Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
				capsHashtable.put("browserName", "Firefox");
				capsHashtable.put("browserVersion", "latest-beta");
				capsHashtable.put("os", "Windows");
				capsHashtable.put("osVersion", "11");
				capsHashtable.put("browser", "Firefox");
				capsHashtable.put("project", "Exclusible");
				capsHashtable.put("build", "Win_Firefox");
				capsHashtable.put("name", "Exclusible_AnnouncementBanner");
				capsHashtable.put("browserstack.local", "false");
				capsHashtable.put("browserstack.debug", "true");
				capsHashtable.put("browserstack.networkLogs", "true");
				capsHashtable.put("browserstack.selenium_version", "4.0.0");
				capsHashtable.put("browserstack.idleTimeout", "<30>");
				Exclusible_Launching deviceTwo = new Exclusible_Launching();
				deviceTwo.executeTest(capsHashtable);
			}
		}
		class DeviceThree implements Runnable {
			
			public void run() {
				Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
				capsHashtable.put("browser", "Chrome");
				capsHashtable.put("browser_version", "latest");
				capsHashtable.put("os", "Windows");
				capsHashtable.put("os_version", "10");
				capsHashtable.put("build", "Win_Chrome");
				capsHashtable.put("name", "Exclusible_AnnouncementBanner");
				capsHashtable.put("browserstack.networkLogs", "true");
				capsHashtable.put("browserstack.selenium_version", "4.0.0");
				capsHashtable.put("browserstack.idleTimeout", "<30>");
				Exclusible_Launching deviceThree = new Exclusible_Launching();
				deviceThree.executeTest(capsHashtable);
				
				
			}
		}
		class DeviceFour implements Runnable {
			public void run() {
				Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
				capsHashtable.put("browser", "Chrome");
				capsHashtable.put("browser_version", "latest");
				capsHashtable.put("os", "OS X");
				capsHashtable.put("os_version", "Monterey");
				capsHashtable.put("build", "MAC_Chrome");
				capsHashtable.put("name", "Exclusible_AnnouncementBanner");
				capsHashtable.put("browserstack.networkLogs", "true");
				capsHashtable.put("browserstack.selenium_version", "4.0.0");
				capsHashtable.put("browserstack.idleTimeout", "<30>");
				Exclusible_Launching deviceFour = new Exclusible_Launching();
				deviceFour.executeTest(capsHashtable);
		  	}
		}
		class DeviceFive implements Runnable {
			
			public void run() {
				Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
				capsHashtable.put("browserName", "Safari");
				capsHashtable.put("browser_version", "14");
				capsHashtable.put("os", "OS X");
				capsHashtable.put("os_version", "Big Sur");
				capsHashtable.put("build", "MAC_Safari");
				capsHashtable.put("name", "Exclusible_AnnouncementBanner");
				capsHashtable.put("browserstack.networkLogs", "true");
				capsHashtable.put("browserstack.selenium_version", "4.0.0");
				capsHashtable.put("browserstack.idleTimeout", "<30>");
				Exclusible_Launching deviceFive = new Exclusible_Launching();
				deviceFive.executeTest(capsHashtable);
		  	}
		}




		Thread threadOne = new Thread(new DeviceOne());
		threadOne.start();
		Thread threadTwo = new Thread(new DeviceTwo());
		threadTwo.start();
		Thread threadThree = new Thread(new DeviceThree());
		threadThree.start();
		Thread threadFour = new Thread(new DeviceFour());
		threadFour.start();
		Thread threadFive = new Thread(new DeviceFive());
		threadFive.start();
		}
	public void executeTest(Hashtable<String, String> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
		
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			key = keysIterator.next();
			caps.setCapability(key, capsHashtable.get(key));
			}
		WebDriver driver;
		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
			final JavascriptExecutor jse = (JavascriptExecutor) driver;
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			try {
				
		        driver.get("http://beta.exclusible.xyz");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().window().maximize();
		        driver.getTitle();
		        wait.until(ExpectedConditions.titleIs("Exclusible | Premium NFT platform for luxury digital collectible assets"));
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/p/span")).click();
		        Thread.sleep(3000);
		        driver.navigate().back();
				
				System.out.println("Page title is : " + driver.getTitle());
				 if (driver.getTitle().equals("Exclusible | Premium NFT platform for luxury digital collectible assets")) {
			            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Test Case Passed!\"}}");
			          }
			} catch (Exception e) {
			            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Test Case failed\"}}");
			          }
			driver.quit();
				
			} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}





