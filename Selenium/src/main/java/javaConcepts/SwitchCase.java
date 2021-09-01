package javaConcepts;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 The switch expression is evaluated once.
		The value of the expression is compared with the values of each case.
		If there is a match, the associated block of code is executed.
		The break and default keywords are optional, and will be described later in this chapter		 
		 */

		int day = 4;
		switch(day) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;	
		}
		
		
		/*
		 When Java reaches a break keyword, it breaks out of the switch block.
		 This will stop the execution of more code and case testing inside the block.
		 When a match is found, and the job is done, it's time for a break. There is no need for more testing. 
		 */
		
		/*
		The default keyword specifies some code to run if there is no case match:
		*/
		 int Day = 4;
		 switch(Day) {
		 case 6 :
			 System.out.println("Monday");
			 break;
		 case 7:
			 System.out.println("Tuesday");
			 break;
		default :
			System.out.println("Looking forward to the weekend");
		 }
		 //Note that if the default statement is used as the last statement in a switch block, it does not need a break.
		 
		 
		
		
	}

}
