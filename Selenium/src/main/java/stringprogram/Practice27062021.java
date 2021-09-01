package stringprogram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice27062021 {

	public static void main(String[] args) {
	//anagram 
		
		String s1 = "Grab";
		String s2 = "brag";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("it is not an anagram ");
		}
		else {
			char [] str1 = s1.toCharArray();
			char [] str2 = s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
		if(Arrays.equals(str1, str2)) {
			System.out.println("It is a anagram");
		}
		else {
			System.out.println("It is a not anagram");
		}
		}
		
		
		String a = "%*^*&#*&*# Rakshit 379479749";
		a = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("removed junk :"+a);
		String ch = "_";
		a = a.replaceAll("", ch);
		System.out.println("underscore :"+a);
		
		//Reverse the string and check pallindrome
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = sc.next();
		String Org_Str = Str;
		String rev = "";
		int len = Str.length();
		for(int i = len-1; i>=0;i--) {
			rev = rev + Str.charAt(i);
		}System.out.println("Reversed string is : "+rev);
		
		if(rev.equals(Org_Str)) {
			System.out.println("The String is a pallindrome "+Org_Str);
		}
		else {
			System.out.println("The String is not pallindrome "+Org_Str);
		}
		
		
		
		//Finding duplicate character in string
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String str = "Beautifulll";
		char[]  Sstr= str.toCharArray();
		for(char c : Sstr) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
			
			for(Map.Entry<Character, Integer> entry : map.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
			}
			
		}
		
		

	//Reverse each word of the String I/p - The World is beautiful O/P - beautiful is World The
		
		System.out.println(Practice27062021.ReverseEachCh("The world is beautiful"));
		
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter the String");
		String[] sst = scc.nextLine().split(" ");
		String rvvword = "";
		for(int i = sst.length-1;i>=0;i--) {
			rvvword = rvvword+sst[i]+" ";
		}
		System.out.println("Reversed words are : "+rvvword);
	
	}
	
	

	//Reverse each character of the string I/p - The World is beautiful O/P - eht dlroW ...
	
	public static String ReverseEachCh(String str) {
		String rev = "";
		String[] strrr = str.split(" ");
		for(String s :strrr ) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			rev = rev + sb.toString() + " ";
		}
		return rev.trim();
		
	}
	

	
	
}
