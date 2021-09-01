package java_Programming;

public class RemoveJunkSpeChar_fromString {

	public static void main(String[] args) {
		String str = "#@@&*@T&!**(!( He is a good boy 03283993738";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The new updated string is : "+str);

	}

}
