package java_Programming;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
	
		int a =10; int b= 20; 
		//Swap the no. 
		b = a+b -(a=b);
		System.out.println("the value of "+a+ " "+b);
	
		//Swap the string 
		String x = "Saluja";
		String y = "Rajat";
		System.out.println("Before swapping the string"+x+" "+y);
		x = x+y;//SalujaRajat
		y = x.substring(0,x.length()-y.length());
		x = x.substring(y.length());
		System.out.println("After swapping the string"+x+" "+y);
		
		//Reverse a number 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int num = sc.nextInt();
		int rev =0;
		while((num!=0)) {
			
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		System.out.println("Reversed number is : "+rev);
		
		
		//Reverse a string
		
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = scc.next();
		String reverse = "";
		int len = Str.length();
		for(int i = len-1; i>=0; i--) {
			reverse= reverse + Str.charAt(i);
			
		}
		System.out.println("Reversed String is : "+reverse);
		
		
		//Reverse the words in string 
	//	Scanner ssscc = new Scanner(System.in);
	//	System.out.println("Enter the string");
//		String strrr[] = ssscc.nextLine().split("");
		String strrr[] = "I am an awesome guy".split(" ");
		String reversal = "";
		for(int i =strrr.length-1;i>=0;i--) {
			reversal  = reversal + strrr[i] + " ";
			
		}
		System.out.println("Reversed the string :"+reversal);
		
		//Pallindrome of String 
		Scanner ScannerSc = new Scanner(System.in);
		System.out.println("Enter the string");
		String strI = ScannerSc.next();
		String org_Str =strI;
		String RReversal ="";
		
		for(int i = strI.length()-1; i>=0;i--) {
			RReversal = RReversal+ strI.charAt(i);
			
		}System.out.println("String has been reversed"+RReversal);
		if(org_Str.equals(RReversal)) {
			System.out.println("It is pallindrome");
		}else {
			System.out.println("It is not pallindrome");
		}
		
		//Pallindrome of no.
		
		Scanner SScannerr = new Scanner(System.in);
		System.out.println("Enter the Number");
		int nummber = SScannerr.nextInt();
		int org_number = nummber;
		int rrreversal = 0;
		while(nummber!=0) {
			rrreversal= rrreversal*10 + nummber%10;
			nummber = nummber/10;
			
		}
		System.out.println("number has been reversed "+rrreversal);
		if(org_number==rrreversal) {
			System.out.println("It is pallindrome number");
		}else {
			System.out.println("It is not pallindrome number");
		}
		

		
		//Factorial of a no.
		int numbbb = 5;
		int fact =1;
		for(int i1 =0; i1<numbbb; i1++) {
			fact = fact*i1;
			
		}System.out.println("The factorial of the "+numbbb+ " " +fact);
			
		
		
	}

}
