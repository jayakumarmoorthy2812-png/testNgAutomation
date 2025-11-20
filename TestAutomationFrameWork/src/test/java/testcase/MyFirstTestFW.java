//$Id$
package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest {
	
	@Test(dataProvider = "testdata") 
public static void LoginTest(String userName) {
	driver.findElement(By.linkText("Sign in")).click();  
driver.findElement(By.xpath(loca.getProperty("email_field"))).sendKeys(userName);
}
	
	@DataProvider(name="testdata")
	public Object[][] tData(){
		return new Object[][] {
			{"jaya@gmail.com"},
			{"kumar@gmail.com"}
			
		};
		
	}
	
}
