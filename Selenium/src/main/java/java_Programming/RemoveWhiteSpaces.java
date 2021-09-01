package java_Programming;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	
		String str = "Java Programming selenium Automation  ";
		str =str.replaceAll("\\s", "");
		System.out.println("Replacing the white spaces:"+str);

	}

}
