package javaConcepts;


abstract class Animal {
public abstract void animalSound();
public void sleep() {
 System.out.println("Zzz");
}
}


class Pig extends Animal {
	
public void animalSound() {
 
 System.out.println("The pig says: wee wee");
}
}


public class JavaAbstractClasses_Methods {

	public static void main(String[] args) {
		
		/*
		Data abstraction is the process of hiding certain details and showing only essential information to the user.
		Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
		The abstract keyword is a non-access modifier, used for classes and methods:
		Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
		Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
		An abstract class can have both abstract and regular methods:

		 abstract class Animal {
  		public abstract void animalSound();
  		public void sleep() {
    	System.out.println("Zzz");
  		}
		}
		
		From the example above, it is not possible to create an object of the Animal class:
		Animal myObj = new Animal(); // will generate an error
	To access the abstract class, it must be inherited from another class. 
	Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:
	
	Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.

Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.
	
	
		 */
		
		
		Pig mpig = new Pig();
		mpig.animalSound();
		mpig.sleep();

	}

}
