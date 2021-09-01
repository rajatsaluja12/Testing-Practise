package javaConcepts;

public class JavaException {

	public static void main(String[] args) {
		
		
/*
 Java Exceptions
 When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

Java try and catch
The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
The try and catch keywords come in pairs:
Finally : The finally statement lets you execute code, after try...catch, regardless of the result:	 

The throw keyword : 
The throw statement allows you to create a custom error.
The throw statement is used together with an exception type. There are many exception types available in Java:
ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:		 
 */

		try {
			int[] number = {1,2,3};
			System.out.println(number[10]);
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("The 'try catch' is finished");
		}
	
		ageCheck(17);
		
		
	}
	
	static void ageCheck(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied - you are not eligible");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}

}
