package practice;

import java.util.Scanner;

public class Reverse_No_Pallindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int org_number = number;
		int rev = 0;
		while(number>0) {
			rev = rev*10+number%10;
			number = number/10;
		}
		System.out.println("Number has been reversed "+rev);
		if(org_number == rev) {
			System.out.println("The number is pallindrome");
		}
		else {
			System.out.println("The number is not pallindrome");
		}
	}

}
