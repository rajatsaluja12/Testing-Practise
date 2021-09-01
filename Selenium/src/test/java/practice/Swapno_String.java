package practice;

public class Swapno_String {

	public static void main(String[] args) {
		
		int x = 10; int y = 20;
		System.out.println("Before the swap"+x+" "+y);
		y = x+y -(x=y);
		System.out.println("After the swap "+x+" "+y);

	
		String a = "Rakshit";
		String b = "Saluja";
		System.out.println("Before the swapping the two strings "+a+" "+b);
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After the swapping the two strings "+a+" "+b);
		
		
	}

}
