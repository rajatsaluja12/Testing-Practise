package javaConcepts;


class Annnimal{
	public void AnimalSound() {
		System.out.println("The animal makes a sound");
	}
}

class ppig extends Annnimal{
	public void AnimalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Ddog extends Annnimal{
	public void AnimalSound() {
		System.out.println("The dog says: bow wow");
	}
}
public class JavaPolymorphism {

	public static void main(String[] args) {
		
/*
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. 
Polymorphism uses those methods to perform different tasks. 
This allows us to perform a single action in different ways.	
	
For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - 
And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
	
Why And When To Use "Inheritance" and "Polymorphism"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
	
 */

		Annnimal myAnimal = new Annnimal(); // creates a Animal object 
		Annnimal myPig = new ppig(); //creates a Pig object		
		Annnimal myDog = new Ddog(); //creates a Dog object
		
		myAnimal.AnimalSound();
		myPig.AnimalSound();
		myDog.AnimalSound();
		
		
	}

}
