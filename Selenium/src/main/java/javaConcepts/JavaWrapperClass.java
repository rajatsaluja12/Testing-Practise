package javaConcepts;

public class JavaWrapperClass {

	public static void main(String[] args) {
		
/*Java Wrapper Classes
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
Primitive Data Type						Wrapper Class
byte									Byte
short									Short
int										Integer
long									Long
float									Float
double									Double
boolean									Boolean
char									Character

Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

Creating Wrapper Objects

For example, the following methods are used to get the value associated with the corresponding wrapper object: 
intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
	 
*/
		
		Integer myInt = 5;
		Double myDouble = 24.67d;
		Character mychar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(mychar);
		
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(mychar.charValue());
		
		Integer myintvalue = 100;
		String myString = myintvalue.toString();
		System.out.println(myString.length());

	}

}
