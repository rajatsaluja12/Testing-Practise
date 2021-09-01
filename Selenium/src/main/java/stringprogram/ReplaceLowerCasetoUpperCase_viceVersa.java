package stringprogram;

public class ReplaceLowerCasetoUpperCase_viceVersa {

	public static void main(String[] args) {
		
		String str1 = "The world is so beautiful";
		StringBuffer newstr = new StringBuffer(str1);
		
		for(int i = 0; i<str1.length();i++) {
			
			//Checks for lower case character
			if(Character.isLowerCase(str1.charAt(i))) {
				newstr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));   
			}
			else if(Character.isUpperCase(str1.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));  
			}
		}
			System.out.println("String after case conversion"+newstr);
	}

}
