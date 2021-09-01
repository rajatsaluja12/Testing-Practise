package stringprogram;

public class ReplacespacewithSpecificChar {

	public static void main(String[] args) {
		
		String str = "The World is so beautiful";
		char ch = '_';
		
		str = str.replace(' ', ch);    
		System.out.println("String after replacing spaces with given character");
		System.out.println(str);
		

	}

}
