package practice;

import java.util.Scanner;

public class ReverseString_Pallindrome {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string ");
	String str = sc.next();
	String org_str = str; 
	String rev = "";
	int str_len = str.length();
	for(int i = str_len-1;i>=0;i--) {
		rev = rev + str.charAt(i)+"";
	}
	System.out.println("Reversed the number "+rev);
	
	if(org_str.equals(rev)) {
		System.out.println("The String is pallindrome");
	}
	else {
		System.out.println("The String is not a pallindrome");
	}

	ReverseString_Pallindrome.WhiteSpace("The world is beautiful");
	ReverseString_Pallindrome.JunkSpace("#&*(#^&$&(& Rakshit Saluja 24y864");
	System.out.println(ReverseString_Pallindrome.ReverseeachWord("The world is beautiful"));
	}
	

public static void WhiteSpace(String RemoveWh) {
	
	RemoveWh= RemoveWh.replaceAll("\\s", "");
	System.out.println("Print the latest string"+RemoveWh);
}

public static void JunkSpace(String RemJunkWord) {
	RemJunkWord = RemJunkWord.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println("Removing the junk words "+RemJunkWord);
}


public static String ReverseeachWord(String str) {
	String [] strArray = str.split("\\s");
	String reverseWord = "";
	for(String Str : strArray) {
		StringBuilder stringb = new StringBuilder(Str);
		stringb.reverse();
		reverseWord = reverseWord + stringb.toString()+ " ";
	}
	
	 return reverseWord.trim();
	
}




}
