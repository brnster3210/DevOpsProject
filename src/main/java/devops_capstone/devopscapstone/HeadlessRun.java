package devops_capstone.devopscapstone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

/**
 * Hello world!
 *
 */
public class HeadlessRun{
		
		public static void main (String [] args) {
			System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
			String expectedUrl = "http://172.31.26.86/";
			
			ChromeOptions options = new ChromeOptions();
            options.addArguments("headless", "no-sandbox");
            options.addArguments("window-size=1200x600");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get(expectedUrl);
			try{
				Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
				driver.findElement(By.xpath("//h2[contains(text(),'Hello world')]"));
				System.out.println("SUCCESS! Navigated to correct webpage.");
				driver.quit();
			}
			catch(Throwable pageNavigationError){
				System.out.println("FAILED! Webpage having issues.");
				driver.quit();
				}
		}
}

