package javaConcepts;

public class Java_Arrays {

	public static void main(String[] args) {
		
/*
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets:
*/
		String car[] ;
		String Car[] = {"BMW","Bentley","Aston Martin","Ford","Mazda"};
		int[] myNum = {10, 20, 30, 40};
		System.out.println(Car[2]);
		
		// Change an Array Element 
		Car[2] = "Porshhe";
		System.out.println(Car[2]);
		System.out.println(Car.length);
		
		for(String carr : Car) {
			System.out.println(carr);
			}
		
		for(int i = 0; i<Car.length; i++) {
			System.out.println(Car[i]);
		}
		
		/*Multidimensional Arrays
		A multidimensional array is an array containing one or more arrays.
		To create a two-dimensional array, add each array within its own set of curly braces:
		*/
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for(int i = 0; i<myNumbers.length; i++) {
			for(int j = 0;j<myNumbers[i].length;j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		}
	

}
