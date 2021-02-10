package SeleniumAutomation.Demo.With.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage {

	WebDriver driver;
	
	//By user99GuruName = By.name("uid"); : // Page Object Model Notation
	
	@FindBy(name="uid")
	WebElement user99GuruName;

	@FindBy(name="password")
	WebElement password99Guru;

	@FindBy(className="barone")
	WebElement titleText;

	@FindBy(name="btnLogin")
	WebElement login;
	
	
	public Guru99LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String userName) {
		
		//driver.findElement(user99GuruName).sendKeys(userName); // Page Object Model Notation
		user99GuruName.sendKeys(userName);
		
	}
	
    public void setPassword(String password) {
		
		password99Guru.sendKeys(password);
	}

    public void clickLogin(){

        login.click();
    }

    public String getLoginTitle(){

     return  titleText.getText();

    }
	
    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();        
    }

}
