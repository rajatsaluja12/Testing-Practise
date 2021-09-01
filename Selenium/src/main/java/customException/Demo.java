package customException;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 10");
		try {
		
			int num = sc.nextInt();
			if(num<1 || num >10) {
				throw new CustomException("Not a valid number!");
			}
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		

	}

}
