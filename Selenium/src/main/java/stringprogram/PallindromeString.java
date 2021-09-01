package stringprogram;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String rev ="";
		String org_rev =str;
		for(int i = str.length()-1; i>=0; i--) {
			rev= rev + str.charAt(i);
			
		}System.out.println("Reversal of the string"+rev);
		if(org_rev.equals(rev)) {
			System.out.println("The String is pallindrome");
		}
		else {
			System.out.println("The String is not pallindrome");
		}
		
		
		

	}

}
