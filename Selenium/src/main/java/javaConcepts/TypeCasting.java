package javaConcepts;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*	Java Type Casting
		 * 	Type casting is when you assign a value of one primitive data type to another type.
		  	In Java, there are two types of casting:
		  	Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double

			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
			
			Widening Casting
			Widening casting is done automatically when passing a smaller size type to a larger size type:
			
			Narrowing Casting
			Narrowing casting must be done manually by placing the type in parentheses in front of the value:
			
			
		 * 
		 */
		
		int number = 99;
		double doublenumb = number; //Automatic casting : int to double widening casting 
		System.out.println("upCasting or you say widening casting "+doublenumb);
		
		float fnum = 23.54f;
		int num = (int)fnum;
		System.out.println("downcasting or narrowing casting is "+num);
		
		
		

	}

}
