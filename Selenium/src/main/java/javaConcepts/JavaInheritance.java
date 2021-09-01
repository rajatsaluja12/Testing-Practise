package javaConcepts;


class Vehicle{
	protected String brand = "Ford";
	public void honk() {
		System.out.println("TUU, TUU");
	}
}



public class JavaInheritance extends Vehicle {
	private String modelname = "Mustang";
	public static void main(String[] args) {
		/*
	Java Inheritance (Subclass and Superclass)
	In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:	 
		 
	subclass (child) - the class that inherits from another class
	superclass (parent) - the class being inherited from	 
	To inherit from a class, use the extends keyword.

	Did you notice the protected modifier in Vehicle?
	We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

	Why And When To Use "Inheritance"?
	It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.
	 
		 */
		
		JavaInheritance mycar =  new JavaInheritance();
		mycar.honk();
		System.out.println(mycar.brand+" "+mycar.modelname);
	

	}

}
