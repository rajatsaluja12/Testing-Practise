package javaConcepts;

public class StringFunction_Methods {

	public static void main(String[] args) {
		
		String str = " The World is beautiful";
		System.out.println(str.indexOf("b")); // Returns index location of character 
		System.out.println(str.indexOf("is"));
		
		String txt = "the world is beautiful";
		System.out.println("The length of the txt string is: " + txt.length());
		
		
		String st = "The world is so beautiful ";
		System.out.println("UpperCase "+st.toUpperCase());
		System.out.println("UpperCase "+st.toLowerCase());
		
		String firstname = "rakshit";
		String secondname = "saluja";
		System.out.println(firstname.concat(secondname));

		System.out.println(firstname+""+secondname);
		String txtt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txtt);
		
		/*
		 Code	Result	
			\n	New Line	
			\r	Carriage Return	
			\t	Tab	
			\b	Backspace	
			\f	Form Feed
		 */
	}

}
