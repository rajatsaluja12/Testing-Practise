package javaConcepts;

public class Constructors {

	int x ; // Create a class attribute
	int modelYear ;
	String ModelName; 
	
	String F_name;
	String L_name;
	int age;
	
	public Constructors() 
	{
		x=5; // set the initial value for the class attrubute to x 
		
	}
	
	public Constructors(int y)
	{
		x=y;
	}
	
	public Constructors(int year, String Mname) {
		modelYear = year;
		ModelName = Mname;
	}
	
	public Constructors(String fname, String lname, int Age ) {
		this.F_name = fname;
		this.L_name = lname;
		this.age = Age;
	}
	
	public static void main(String[] args) {
		
		
	/*Java Constructors
	A constructor in Java is a special method that is used to initialize objects.
	The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:	
	
	Note that the constructor name must match the class name, and it cannot have a return type (like void).
	Also note that the constructor is called when the object is created.
	All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
	However, then you are not able to set initial values for object attributes.
	
	Constructor Parameters
	
	Constructors can also take parameters, which is used to initialize attributes.
	The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). 
	When we call the constructor, we pass a parameter to the constructor (8), which will set the value of x to 8:
	
	
	 */
		
		Constructors myObj = new Constructors();
		System.out.println(myObj.x);
		Constructors myObj11 = new Constructors(8);	
		System.out.println(myObj11.x);
	
		Constructors CarDetails = new Constructors(1992,"TATA");
		System.out.println(CarDetails.ModelName+" "+CarDetails.modelYear);

		Constructors PersonalDetails = new Constructors("Rakshit", "Saluja", 29) ;
		System.out.println(PersonalDetails.F_name+" "+PersonalDetails.L_name+" "+PersonalDetails.age);
	}
}
