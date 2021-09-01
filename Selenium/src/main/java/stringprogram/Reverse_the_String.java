package stringprogram;

import java.util.Scanner;

public class Reverse_the_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String[] str = sc.nextLine().split(" ");
		String rev = "";
		for(int i = str.length-1; i>=0; i--) {
			rev = rev+str[i]+" ";
			
		}System.out.println("Reverse of the string is "+rev);
		


	}

}
