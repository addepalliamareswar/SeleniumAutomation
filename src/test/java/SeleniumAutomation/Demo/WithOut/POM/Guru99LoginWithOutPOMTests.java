package SeleniumAutomation.Demo.WithOut.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumAutomation.Demo.firstpackage.AbstractTestClass;

public class Guru99LoginWithOutPOMTests extends AbstractTestClass {

	
	@Test
	public void gury99LoginTestMethod() {
		
		
		String baseUrl = "http://demo.guru99.com/V4/";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		
		driver.findElement(By.name("uid")).sendKeys("mngr307436");
		
		driver.findElement(By.name("password")).sendKeys("yjajepE");
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		String homeText = driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]")).getText();
		
		Assert.assertEquals(homeText, "Guru99 Bank");
		
	}
	
	
}
