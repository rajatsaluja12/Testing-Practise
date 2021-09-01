package stringprogram;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "The world is so beautiful";
		str = str.replaceAll("\\s+", "");

		System.out.println("String after removing all the white spaces: "+str);
	}

}
