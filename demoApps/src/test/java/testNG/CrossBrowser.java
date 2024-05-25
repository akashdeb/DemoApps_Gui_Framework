package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	@Parameters("browser")
	@Test
	public void googleTest(String localBrowser) {
		WebDriver driver = null;
		if(localBrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(localBrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		if(localBrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		
	}
	

}
