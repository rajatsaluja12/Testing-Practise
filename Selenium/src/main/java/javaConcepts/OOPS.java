package javaConcepts;

public class OOPS {

	public int x = 5;
	final int j = 77; 
	public static void main(String[] args) {
		
		/*
		 OOP stands for Object-Oriented Programming.
		 Object-oriented programming has several advantages over procedural programming:
			OOP is faster and easier to execute
			OOP provides a clear structure for the programs
			OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
			OOP makes it possible to create full reusable applications with less code and shorter development time
			
			Classes and objects are the two main aspects of object-oriented programming.
			Class -- Fruit | Objects -- banana, Apple, mango
			Class - Car | objects -- Volvo, tata, Toyato
			class is a template for objects, and an object is an instance of a class.
			When the individual objects are created, they inherit all the variables and methods from the class.
			
			Classes and Objects 
			Everything in Java is associated with classes and objects, along with its attributes and methods. 
			For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
			public class Main(){
			int x = 5;
			To create an object of Main, specify the class name, followed by the object name, and use the keyword new:
			
			Java Class Attribute 
			we used the term "variable" for x in the example (as shown below). 
			It is actually an attribute of the class. Or you could say that class attributes are variables within a class:
			
			The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

			Multiple Objects
			If you create multiple objects of one class, 
			you can change the attribute values in one object, without affecting the attribute values in the other:
			
			Static vs. Non-Static
			
			Static method, which means that it can be accessed without creating an object of the class, 
			unlike public, which can only be accessed by objects:
			
			Access Methods With an Object
			
		 */
	
		
		OOPS Multiatttribute = new OOPS();
		Multiatttribute.x = 25;
		System.out.println(Multiatttribute.x);
	
		
		OOPS atttribute = new OOPS();
		System.out.println(atttribute.x);
		
		// Modify Attribute 
		atttribute.x = 40;
		System.out.println("Modifying the attribute: "+atttribute.x); // this is overriding 
		// if you dont want to be overrided, declare the attribute as final 
		
		
		OOPS oo = new OOPS();
		OOPS bo = new OOPS();
		System.out.println(bo.x);
		System.out.println(oo.x);
		
		//Calling from different class
		Secondary sec = new Secondary();
		System.out.println(sec.a);
		
		//calling the method
		OOPS addition = new OOPS();
		addition.Mymethod(20,40);
		
		OOPS.Method1();
		
		sec.fullThrottle();
		sec.speed(100);
	
	}
	//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:

	
	
	
	public void Mymethod(int a , int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	//Java Class Methods
	static void Method1() {
		System.out.println("The World is beautiful");
	}
	
	
	
	
}

	class Secondary {
	int a = 5;
	
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	public void speed(int speed) {
		System.out.println("max speed"+speed);
	}
	
	
}