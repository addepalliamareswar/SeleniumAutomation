package SeleniumAutomation.Demo.WithOut.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SeleniumAutomation.Demo.firstpackage.AbstractTestClass;
import SeleniumAutomation.Demo.uilibrary.ElementLibrary;

public class Guru99LoginWithOutPOMTests extends AbstractTestClass {

	WebElement element;
	ElementLibrary el;
	
	@BeforeClass
	public void setDriverToUiLibrary() {
		el = new ElementLibrary(driver);

	}
	
	@Test
	public void gury99LoginTestMethod() {
		
		String baseUrl = "http://demo.guru99.com/V4/";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		
		element = driver.findElement(By.name("uid"));
		el.fillInput(element, "mngr310911");
		
		element = driver.findElement(By.name("password"));
		el.fillInput(element, "ymAhAju");
		
		element = driver.findElement(By.name("btnLogin"));
		el.click(element);
		
		//driver.findElement(By.name("uid")).sendKeys("mngr307436");
		
		//driver.findElement(By.name("password")).sendKeys("yjajepE");
		
		//driver.findElement(By.name("btnLogin")).click();
		
		element =  driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]"));
		String homeText = el.getText(element);
		
		//String homeText = driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]")).getText();
		
		Assert.assertEquals(homeText, "Guru99 Bank");
		
	}
	
	
}
