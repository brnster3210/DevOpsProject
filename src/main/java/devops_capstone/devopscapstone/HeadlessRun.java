package devops_capstone.devopscapstone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Hello world!
 *
 */
public class HeadlessRun{
		
		public static void main (String [] args) {
			System.setProperty("webdriver.chrome.driver", "//Users//iBrown//Documents//DevOps//CaseStudy//chromedriver");
			String expectedUrl = "http://54.175.170.133/";
			WebDriver driver = new ChromeDriver();
			driver.get(expectedUrl);
			try{
				Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
				driver.findElement(By.xpath("//h2[contains(text(),'Hello world on TEST MACHINE!')]"));
				System.out.println("SUCCESS! Navigated to correct webpage.");
			}
			catch(Throwable pageNavigationError){
				System.out.println("FAILED! Webpage having issues.");
				}
		}
}

