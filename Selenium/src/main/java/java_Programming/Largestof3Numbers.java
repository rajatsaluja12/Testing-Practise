package java_Programming;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		
		//Approach 1 - Logic
		
		if(a>b && a>c) {
			System.out.println(a+ " is largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+ " is largest number");
		}
		else {
			System.out.println(" c is largest number");
		}
		
		//Ternary operator
	}

}
