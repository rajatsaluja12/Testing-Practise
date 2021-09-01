package java_Programming;

public class Count_Character_occurence {

	public static void main(String[] args) {
		String str = "naman";
		int totalcount = str.length();// total length of the string
		int totalCount_afterremovingchar= str.replace("a", "").length();
		int count = totalcount-totalCount_afterremovingchar;
		System.out.println("No. of occurances of a :"+count);
	}
	
	
	

}
