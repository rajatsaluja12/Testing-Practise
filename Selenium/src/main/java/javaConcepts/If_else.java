package javaConcepts;

public class If_else {

	public static void main(String[] args) {
		/*
		 	Use if to specify a block of code to be executed, if a specified condition is true
			Use else to specify a block of code to be executed, if the same condition is false
			Use else if to specify a new condition to test, if the first condition is false
			Use switch to specify many alternative blocks of code to be executed
		 */
		if(20>18) {
			System.out.println("20 is greater than 18 ");
		}
		
	int x = 20;int y = 18;
	if(x>y) {
		System.out.println("x is greater than y");
	}
	
	int time = 20;
	if(time<18) {
		System.out.println("Good Day");
	}else {
		System.out.println("Good evening");
	}
	
	
	int timee = 22;
	if(timee<10) {
		System.out.println("Good morning");
	}else if(time<18) {
		System.out.println("Good day");
	}
	else {
		System.out.println("Good evening");
	}
	
	
	/*
	 		Short Hand If...Else (Ternary Operator)
	 		There is also a short-hand if else, which is known as the ternary operator because it consists of three operands. 
	 		It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:		
	 		
	 		int time = 20;
			if (time < 18) {
  			System.out.println("Good day.");	
			} else {
  			System.out.println("Good evening.");
			}
	 */
	int timeee = 20;
	String result = (timeee<18) ?"Good day." : "Good Evening";
	System.out.println(result);
	
	
	}

}
