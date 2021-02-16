package SeleniumAutomation.Demo.yamlparser;

import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SeleniumAutomation.Demo.Customer;
import SeleniumAutomation.Demo.YamlObjectMapper;

public class TestYamlData2 {

	Customer customer;
	
	@BeforeClass
	public void yamlToJavaObject() {
		
		YamlObjectMapper yamlLoader = new YamlObjectMapper();
		customer  = (Customer) yamlLoader.yamlToJavaObject("testData2.yaml", Customer.class);
	    
	}
	
	@Test
	public void validateFirstName() {
		
		Assert.assertEquals(customer.getFirstName(), "Amar", "Firstname is not matched");
	}
	
	@Test
	
	public void validateLastName() {
		Assert.assertEquals(customer.getLastName(), "Addepalli", "Lastname is not matched");

	}
	
}
