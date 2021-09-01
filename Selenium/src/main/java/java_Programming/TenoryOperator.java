package java_Programming;

public class TenoryOperator {

	public static void main(String[] args) {
	
		/*
		 Java ternary operator is the only conditional operator that takes three operands. 
		 It’s a one-liner replacement for if-then-else statement and used a lot in Java programming. 
		 We can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators. 
		 Although it follows the same algorithm as of if-else statement, 
		 the conditional operator takes less space and helps to write the if-else statements in the shortest way possible. 		 
		 */
		
		// variable declaration
        int n1 = 5, n2 = 10, max;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
 
        // Print the largest number
        System.out.println("Maximum is = " + max);
        
        
  // 2nd example 
        
        // variable declaration
        int nn1 = 5, nn2 = 10, res;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Performing ternary operation
        res = (nn1 > nn2) ? (nn1 + nn2) : (nn1 - nn2);
 
        // Print the largest number
        System.out.println("Result = " + res);
        
	}

}
