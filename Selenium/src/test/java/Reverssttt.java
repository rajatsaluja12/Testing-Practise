import java.util.Scanner;

public class Reverssttt {

	public static void main(String[] args) {
		
		System.out.println(Reverssttt.reverseWord("my name is khan"));  
	    System.out.println(Reverssttt.reverseWord("I am sonoo jaiswal"));    
	    
	}
	
		//	I/P: Committed to working
		//	O/P: dettimmoC ot gnikrow
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String[] strr =sc.nextLine().split("");
	//	String[]  str=  "Committed to working".split(" ");
			String rev = "";
			for(int i=strr.length -1; i>=0;i--) {
				rev = rev+ strr[i] +"";
						
			}System.out.println("Reversed String is "+rev);
			*/
			
			public static String reverseWord(String str){  
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
	
	
	



	


