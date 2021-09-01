package java_Programming;

public class Reverse_a_string {

	public static void main(String[] args) {
		//Logic 1 - Using concatation method
		
	 String str = "Rajat";
	 String rev="";
	 /*
	 int strlen = str.length();

	 for(int i=strlen-1;i>=0;i--) {
		 rev = rev + str.charAt(i);		 
	 }
	System.out.println(rev);
	}
*/	
	//Logic 2 - using character array 
	/*	char a[] = str.toCharArray();
		int len = a.length;
		
		for(int i = len-1;i>=0;i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
*/
	 
	 //Logic 3 - Using String Buffer class 
	 StringBuffer sb = new StringBuffer(str);
	 System.out.println(sb.reverse());
	 
}
}
