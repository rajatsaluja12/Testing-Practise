
public class ReversetheString {

	public static void main(String[] args) {
		
	//	I/P: Committed to working
	//	O/P: dettimmoC ot gnikrow
		
		String[] str =  "Committed to working".split(" ");
		String rev = "";
		for(int i=str.length -1; i>=0;i--) {
			rev = rev+ str[i] +"";
					
		}System.out.println("Reversed String is "+rev);

	}

}
