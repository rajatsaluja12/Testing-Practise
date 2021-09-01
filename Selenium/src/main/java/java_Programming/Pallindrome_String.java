package java_Programming;

import java.util.Scanner;

public class Pallindrome_String {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.next();
	String org_str = str;
	
	String rev ="";
	int len =str.length();
	for(int i =len-1;i>=0;i--) {
		rev = rev+str.charAt(i);
	}
	System.out.println("It is reversed "+rev);
	if(org_str.equals(rev)) {
		System.out.println(org_str+"The num is pallindrome");
	}else {
		System.out.println(org_str+"The num is not pallindrome");
	}
	}
}
