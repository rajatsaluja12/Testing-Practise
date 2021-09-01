package java_Programming;

import java.util.Scanner;

public class Reverse_Each_wordof_String {

	public static void main(String[] args) {
		
		System.out.println(Reverse_Each_wordof_String.ReverseWord("my name is Rakshit Saluja"));  
	    System.out.println(Reverse_Each_wordof_String.ReverseWord("Committing to working"));    
	   
	}
	
	public static String ReverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  

}
