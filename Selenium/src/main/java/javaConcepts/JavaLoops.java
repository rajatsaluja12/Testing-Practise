package javaConcepts;

public class JavaLoops {

	public static void main(String[] args) {
		
		/*
		 Loops can execute a block of code as long as a specified condition is reached.
		 Loops are handy because they save time, reduce errors, and they make code more readable. 
		 */
		
		
		/* JAVA While Loop
		The while loop loops through a block of code as long as a specified condition is true:
		Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
		 */
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		
		/* JAVA Do/While Loop
		The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, 
		then it will repeat the loop as long as the condition is true.
		Do not forget to increase the variable used in the condition, otherwise the loop will never end!
		 */
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j<5);
		
		
		/* JAVA FOR Loop
		When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop: 
		Statement 1 is executed (one time) before the execution of the code block.
		Statement 2 defines the condition for executing the code block.
		Statement 3 is executed (every time) after the code block has been executed.
		 */
		for(int x = 0; x<5;x++) {
			System.out.println(x);
		}
		
		//print even values 
		for(int y =0;y<10; y=y+2) {
			System.out.println(y);
		}
		
		/* JAVA For Each loop
		There is also a "for-each" loop, which is used exclusively to loop through elements in an array: 
		*/
		
		String[] cars = {"Volvo","BMW", "Ford", "Mazda"};
		for(String Carnames : cars) {
			System.out.println(Carnames);
		}
		
		/*JAVA BREAK
		 The break statement can also be used to jump out of a loop.
		 */
		for(int a = 0; a<5;a++) {
			if(a==3) {
			break;
			}
			System.out.println(a);
		}
		
/*JAVA Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
*/
		for(int b =0; b<10; b++) {
			if(b==4) {
				continue;
			}
			System.out.println(b);
		}
		
/*JAVA Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
*/	
		
		
		
	}

}
