package java_Programming;

public class Swapping_two_numbers {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		System.out.println("Before swapping the values.."+a+" "+b);
		
		//Logic 1 - Third variable 
		/*int t = a; 
		a=b;//20
		b=t;//10
		
		System.out.println("After swapping the values.."+a+" "+b);
*/
		//Logic 2 -->  use + & - , without using third variable 
/*		
		a= a+b;// a =30
		b=a-b;// b = 30-20 b becomes 10
		a = a-b; //30-10 , a becomes 20 
		
		System.out.println("After swapping the values without using third variable.."+a+" "+b);
	*/	
		//Logic 3 -->  use * & / , without using third variable , only when a and b are not be zero
	/*	
		a= a*b; //a = 200
		b =a/b; //b = 200/20 now b becomes 10
		a=a/b; //a = 200/10 , now a becomes 20
		System.out.println("After swapping the values without using third variable.."+a+" "+b);
	*/	
		//Logic 4 -->  use bitwise operator XOR(^)
		
/*		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swapping the values without using third variable.."+a+" "+b);
*/			
		//Logic 5 -->  Single Statement
		//b = a+b-(a=b);
		b=a+b-(a=b);
		System.out.println("After swapping the values without using third variable.."+a+" "+b);
		
		int x = 55; int y = 76;
		y = x+y-(x=y);
		System.out.println("swapping the values of x and y "+x+" "+y);
		
	}

}
