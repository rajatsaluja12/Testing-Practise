package javaConcepts;

interface personalDetaisss{
	public void pandetails();
	public void aadhardetails();
	
}

class Pdetails implements personalDetaisss{

	public void pandetails() {
	System.out.println("Pan card details are : hdsjgd");
		
	}

	public void aadhardetails() {
		System.out.println("Pan card details are : hidfuf");
		
	}
	
}

interface FirstInterface{
	public void FirstMethod();
	
}

interface SecondInterface{
	public void SecondMethod();
	
}


class DemoClasMultiInterface implements FirstInterface,SecondInterface{

	public void SecondMethod() {
		
		System.out.println("1 Random statement");
	}

	public void FirstMethod() {
		System.out.println("2 Random statement");
		
	}
	
}
public class JavaInterface {

	public static void main(String[] args) {
/*
Interfaces
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:
interface Animal {
public void animalSound(); // interface method (does not have a body)
public void run(); // interface method (does not have a body)
}
To access the interface methods, 
the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class:


Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
Note: To implement multiple interfaces, separate them with a comma (see example below).

Multiple Interfaces
To implement multiple interfaces, separate them with a comma:

*/
		Pdetails pde = new Pdetails();
		pde.pandetails();
		pde.aadhardetails();
		
		DemoClasMultiInterface MultiInheritanceDemo = new DemoClasMultiInterface();
		MultiInheritanceDemo.FirstMethod();
		MultiInheritanceDemo.SecondMethod();
	}

}
