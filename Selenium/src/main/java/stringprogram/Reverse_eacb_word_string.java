package stringprogram;

public class Reverse_eacb_word_string {

	public static void main(String[] args) {
		System.out.println(Reverse_eacb_word_string.Reverseword("The World is beautiful"));
		
		

	}
	public static String Reverseword(String str)
	{
		String words[] = str.split("\\s");
		String reversewords ="";
		for(String stt :words ) {
			StringBuilder sb = new StringBuilder(stt);
			sb.reverse();
			reversewords = reversewords+ sb.toString() + " ";
			
		}
		
		
		return reversewords.trim();  
		
	}

}
