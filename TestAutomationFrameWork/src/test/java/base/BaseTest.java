//$Id$
package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static Properties prope=new Properties();
	
	public static Properties loca=new Properties();
	
	public static FileReader fr;
	
	@BeforeTest
	public void setup() throws IOException {
		if(driver==null) {
			//System.getProperty("user.dir");
			FileReader fr=new FileReader("/home/jaya-14813/Downloads/learning/TestAutomationFrameWork/src/test/resources/config.properties");
			
			FileReader fr1=new FileReader("/home/jaya-14813/Downloads/learning/TestAutomationFrameWork/src/test/resources/Locators.properties");

			prope.load(fr);
			loca.load(fr1);
		}
		
		if(prope.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get(prope.getProperty("testurl"));
			
		}
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
