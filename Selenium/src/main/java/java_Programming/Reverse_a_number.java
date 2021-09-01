package java_Programming;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
*/		
		//1. Logic 1 - Algorithm 
		
/*	int rev = 0;
	while(num!=0)
	 {	
			rev=rev*10 + num%10;
			num = num/10;	
	}
	System.out.println("Reverse number is "+rev);

	}
*/	
	//Using String Buffer class method
	
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is :"+rev);

		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder revv=sb.reverse();
		System.out.println("Reverse value is "+revv);
			*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new number..");
		int num = sc.nextInt();
		
		int rev= 0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num = num/10;
		
		}
		System.out.println("Reverse value will be : "+rev);
		
		int a =10; int b =20;
		b = a+b-(a=b);
		System.out.println("swapped no. is "+a+" "+b);
}
	



}
