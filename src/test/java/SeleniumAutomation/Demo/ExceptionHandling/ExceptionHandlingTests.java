package SeleniumAutomation.Demo.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class ExceptionHandlingTests {

	// Exceptions:
		
	// 1. Un Checked Exceptions : Run time exceptions
	// 2. Checked Exceptions : Compile time exceptions
	
	// ERRORS:
	//  Errors : We can not control the Errors 
	
	// Exception can be thrown or catch.
	
	// Try
	// Catch
	// Throws 
	// Finally
	// throw
	
	@Test
	public void checkedExceptionsExample() {
		try {
			FileInputStream in = new FileInputStream("MyFirstcel.xlsx");
			
			
			System.out.println("File is present");
		} catch (FileNotFoundException e) {
			System.out.println("File is not present");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch(Exception e) {
			System.out.println("File is not present");
			e.printStackTrace();
		}  finally {
			
			System.out.println("Final block");
		}
		
        System.out.println("Next statment");
	}
	
	
   public void CheckedExceptionsExample1() throws FileNotFoundException {
		
		FileInputStream in = new FileInputStream("MyFirstcel.xlsx");
		System.out.println("Next statment");

  }
   
   @Test
   public void validate(){  
	   int age = 20;
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote"); 
	     
	   System.out.println("Next Statement");  
	}  
   
   
	
	@Test
	public void unCheckedException() {
		
		try {
			int[] arrayValues = new int[3];
			arrayValues[4] = 1100;
		} catch(Exception e) {
			
			System.out.println("Exception Found"+e.getMessage());
		}
		
	}
	   
}
