package Practise;

import java.util.Scanner;

public class countofcharinString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.nextLine();
		System.out.println("Enter charcter to know its occurrence");
		char c = scn.next().charAt(0);
		int count = 0;

		for (int i = 0 ; i <str.length();i++) {

			char ch = str.charAt(i);

			if(ch==c) {
				count++;
			}
		}
		System.out.println("count is "+count);

	}

}
