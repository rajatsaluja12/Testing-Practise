package javaConcepts;

abstract class Classone{ // abstract class 
	public int age = 24;
	public String fname = "Rakshit";
	public abstract void personalDetails() ;
	
}

class MyDetails extends Classone{ // Subclass extends the abstract class 
	public int graduationyear = 2014;


	public void personalDetails() {
		System.out.println("Personal details of this guy");	
	}
}


public class AbstractTry {

	public static void main(String[] args) {
		
		MyDetails details = new MyDetails();
		System.out.println("Age of mine is :"+details.age);
		System.out.println("Name is :"+details.fname);
		details.personalDetails();
		System.out.println("Graduation year is:"+details.graduationyear);

	}

}
