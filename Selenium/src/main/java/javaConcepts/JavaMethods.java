package javaConcepts;

public class JavaMethods {

	public static void main(String[] args) {
		Method1("Rakshit", "Saluja", 29);
		Method2("Rakshit");
		Method2("Rajat");
		Method2("Rakesh");
		
		System.out.println(RetMethod(8));
		System.out.println(RetMethods(8,4));
		int z = RetMethodsvar(5,8);
		System.out.println(z);
		checkage(20);
	
		int numInt = (int)plusMethodInt(20,30);
		double mydNum = plusMethodInt(20.56, 677.32);
		System.out.println("int :"+numInt);
		System.out.println("double :"+mydNum);
		
		int result = sum(5);
		System.out.println(result);
		
		int value = Sum(5,10);
		System.out.println(value);
		/*
		 A method is a block of code which only runs when it is called.
		 You can pass data, known as parameters, into a method.
		 Methods are used to perform certain actions, and they are also known as functions.
		 Why use methods? To reuse code: define the code once, and use it many times.
		 
		 Method1()  is the name of the method
		 static means that the method belongs to the Main class and not an object of the Main class.
		 void means that this method does not have a return value.
	 
		 */
		}

	 	static void Method1(String Fname, String lastname, int age) {
	 		System.out.println(Fname+" "+lastname+" "+age);
	 		//System.out.println("This world is beautiful");
	}

	 	/* JAVA Method Parameter
		
		Parameters and Arguments
		Information can be passed to methods as parameter. Parameters act as variables inside the method.
		The following example has a method that takes a String called fname as parameter. 
		When the method is called, we pass along a first name, which is used inside the method to print the full name:
		 */
	 	
	 	static void Method2(String name) {
	 		System.out.println(name+" Saluja");
	 	}
	 	
	 	/* Return value
		
		The void keyword, used in the examples above, indicates that the method should not return a value.
		If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) 
		instead of void, and use the return keyword inside the method:
		 */
	 	
	 	static int RetMethod(int x) {
			return 5+ x;		
	 	}
	 	
	 	static int RetMethods(int x, int y) {
			return x+y;	
	 	}
	 	

	 	static int RetMethodsvar(int x, int y) {
			return x+y;	
	 	}
	 	
	 	static void checkage(int age) {
	 		if(age<18) {
	 			System.out.println("Access Denied,.. You are not allowed to enter");
	 		}
	 		else {
	 			System.out.println("Access granted - You are old enough!");
	 		}
	 	}
	 	
	 	/* Method Overloading
		
		With method overloading, multiple methods can have the same name with different parameters:
		int MyMethod(int x)
	 	int MyMethods(int a, int b)
	 	double MydMethods(double i, double j, double k)
		 */
	 	
	 	static double plusMethodInt(double d, double e) {
	 		return  (d+e);
	 	}
	 	
	 	/* JAVA Scope
		Method Scope
		Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
		Block Scope
		A block of code refers to all of the code between curly braces {}
		Variables declared inside blocks of code are only accessible by the code between the curly braces, 
		which follows the line in which the variable was declared:	
		 */
	
	 	/* JAVA Recursion
		Recursion is the technique of making a function call itself. 
		This technique provides a way to break complicated problems down into simple problems which are easier to solve.
		 */ 	
	 	
	 	public static int sum(int k) {
	 		if(k>0) {
	 			return k+sum(k-1);
	 		}else {
	 			return 0;
	 		}
	 	}
	 	
	 	
	 	/* Halting Condition
		Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion.
		Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition,
		which is the condition where the function stops calling itself.
		In the previous example, the halting condition is when the parameter k becomes 0. 
		 */
	 	
	 	public static int Sum(int start, int end) {
	 		if(end>start) {
	 			return end + Sum(start, end-1); 			
	 		}else {
	 			return 0;
	 		}
	 	}
	 	
}

