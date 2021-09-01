package JavaPatterns;

public class AplhabetPattern {
//* Printing the Alphabet pattern...**

//        A
//	      A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F	
	
	
	// we will use the concept of ascii value 
	
	public static void main(String[] args) {
		int alpha = 65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}

		
	}

}
// To make the pattern with small letters, just change the value of alpha to 97 i.e., int alpha = 97;