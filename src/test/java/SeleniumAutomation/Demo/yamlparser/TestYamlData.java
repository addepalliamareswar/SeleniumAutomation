package SeleniumAutomation.Demo.yamlparser;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SeleniumAutomation.Demo.Customer;
import SeleniumAutomation.Demo.YamlObjectMapper;

public class TestYamlData {

	Customer customer;
	
	@BeforeClass
	public void yamlToJavaObject() {
		
		YamlObjectMapper yamlLoader = new YamlObjectMapper();
		customer  = (Customer) yamlLoader.yamlToJavaObject("testData.yaml", Customer.class);
	    
	}
	
	@Test
	public void validateFirstName() {
		
		Assert.assertEquals(customer.getFirstName(), "Amar", "Firstname is not matched");
	}
	
	@Test
	
	public void validateLastName() {
		Assert.assertEquals(customer.getLastName(), "Doe", "Lastname is not matched");

	}
	
}
