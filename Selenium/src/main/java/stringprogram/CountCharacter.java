package stringprogram;

public class CountCharacter {

	public static void main(String[] args) {
	
		String str = "This world is beautiful";
		int count = 0;
	//count each character except space 
		for(int i =0; i<str.length();i++) {
			 if(str.charAt(i) != ' ')    
				count++;
			}
		System.out.println("Total no. of character in a string "+count);
		}

		}

	
	


