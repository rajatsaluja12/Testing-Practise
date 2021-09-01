package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class javaArraylist {

	public static void main(String[] args) {
		
		
/*Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.
		
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
	
		 */

ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("TATA");
cars.add("HONDA");
System.out.println(cars);		

/*Access an Item
To access an element in the ArrayList, use the get() method and refer to the index number:
*/

System.out.println(cars.get(1));
	

/*Change an Item
To modify an element, use the set() method and refer to the index number:
*/	
	
cars.set(0, "Mahindra");
System.out.println(cars);

/*Remove an Item
To remove an element, use the remove() method and refer to the index number:
*/

cars.remove(2);
System.out.println(cars);

//To remove all the elements in the ArrayList, use the clear() method:

cars.clear();
System.out.println(cars);

//To find out how many elements an ArrayList have, use the size method:
ArrayList<String> Bike = new ArrayList<String>();
Bike.add("Pular");
Bike.add("Apache");
Bike.add("Bullet");
Bike.size();
System.out.println(Bike);

/*Loop Through an ArrayList
Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
*/
for(int i =0; i<Bike.size(); i++) {
	System.out.println(Bike.get(i));
}

//You can also loop through an ArrayList with the for-each loop:

for(String bike : Bike) {
	System.out.println(bike);
}


/*Other Types
 Elements in an ArrayList are actually objects.
 In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type).
 To use other types, such as int, you must specify an equivalent wrapper class: Integer.
 For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
example below :
 */

ArrayList<Integer> mynumber = new ArrayList<Integer>();
mynumber.add(10);
mynumber.add(20);
mynumber.add(30);
mynumber.add(40);

for(int no : mynumber) {
	System.out.println(no);
}



/*Sort an ArrayList
Another useful class in the java.util package is the Collections class, 
which include the sort() method for sorting lists alphabetically or numerically:
*/

Collections.sort(Bike);
for(String i : Bike) {
	System.out.println(i);
}
Collections.sort(mynumber);
for(int j : mynumber) {
	System.out.println(j);
}

	}
	
	
	
	
}
