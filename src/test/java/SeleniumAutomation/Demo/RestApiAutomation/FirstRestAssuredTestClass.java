package SeleniumAutomation.Demo.RestApiAutomation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.*;

public class FirstRestAssuredTestClass {
	
	
	@Test
	public void getResponseBody1(){
		   given()
		   .when()
		   .get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
		   .then()
		   .log()
		  .all();
		 
		}
	
	@Test
	public void getResponseBody(){
		 
		   given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1")
		           .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
		           .body();
  }
	
	@Test
	public void getResponseStatus(){
		   int statusCode = given()
				   .queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1")
		           .when().get("http://demo.guru99.com/V4/sinkministatement.php")
		           .getStatusCode();
		   
		   System.out.println("The response status is "+statusCode);
		   String url = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
		   given().when().get(url).then().assertThat().statusCode(200);

		}

	
}
