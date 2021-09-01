package java_Programming;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5, 6 };
		int a2[] = { 1, 2, 3, 4, 5, 6 };
		boolean status = Arrays.equals(a1, a2);
		if (status == true) {
			System.out.println("Array is equal");
		} else {
			System.out.println("Array is not equal ");
		}

		int a = 10;
		int b = 20;
		b = a - b + (a = b);
		System.out.println("values are : " + a + " " + b);

		String junkChar = "$&#%&%#&^^#* The world is beautiful 02793479489";
		String RemovedJunk = junkChar.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Removed junk character string is " + RemovedJunk);

		String RemoveWhiteSpaces = junkChar.replaceAll("//s", "");
		System.out.println("Removing white space " + RemoveWhiteSpaces);

		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		int rev = 0;
		int org_rev = Number;
		while (Number != 0) {
			rev = rev * 10 + Number % 10;
			Number = Number / 10;
		}
		System.out.println("Reverse of the no. " + rev);
		if (org_rev == rev) {
			System.out.println("the no. is paalindrome");
		} else {
			System.out.println("No. is not pallindrome");
		}

		Scanner strr = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = strr.next();
		String org_str = string;
		String revee = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			revee = revee + string.charAt(i);

		}
		System.out.println(revee);
		if (org_str.equals(revee)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}

		// Count even and odd no.

		int num = 7894;
		int evenNumber = 0;
		int oddnumber = 0;

		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				evenNumber++;
			} else {
				oddnumber++;

			}
			num = num / 10;
		}
		System.out.println("Number of even : " + evenNumber);
		System.out.println("Number of even : " + oddnumber);

		// Count no. of digits

		int number = 7894;
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);

		// fibonnaci series
		int n1 = 0, n2 = 0, sum = 0;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i < 10; i++) {
			sum = n1 + n2;
			System.out.println("" + sum);
			n1 = n2;
			n2 = sum;

		}

		// fatorial

		int fact = 1, numbb = 5;
		
		// for(int i = 1; i<5; i++) { fact = fact*i; }
		 
		 fact = factorial(numbb);
		System.out.println("Factorial of " + number + " is: " + fact);

		System.out.println(Practice2.ReverseWord("My name is Rakshit"));
		int aaa[] = {1,2,3,4,5,6};
		System.out.println("Second highest value is "+getSecondhighest(aaa,3));
		
		//Swapping the string
		String x = "Rakshit";
		String y = "Saluja";
		System.out.println("Before Swapping the two strings :"+x+ " "+y );
		 x = x+y;
		 y = x.substring(0,x.length()-y.length());
		 x = x.substring(y.length());
		 System.out.println("After swapping"+a+ " "+b);
		 
		 //sum of digits 
		 int nummm = 12488;
		 int summm = 0;
		 while (num>0) {
			 summm = summm+ nummm%10;
			 nummm = nummm/10;
		 }
		 System.out.println(summm);

	}
	

	
	  static int factorial(int n) { if(n==0) { return 1;
	  
	  }else { return (n*factorial(n-1));
	  
	  }
	  
	 
	 }
	 // Reverse word in string 
	  public static String ReverseWord(String str) {
		  String string[] = str.split("//s");
		  String reveeWord = "";
		  for(String s : string) {
			  StringBuffer stt = new StringBuffer(s);
			  stt.reverse();
			  reveeWord = reveeWord+stt.toString()+" ";
			  
		  } return reveeWord.trim();
		  
	  }
	  
	  public static int getSecondhighest(int[]a, int total) {
		  int temp;
		  for(int i=0; i<total ; i++) {
			  for(int j = i+1; j < total; j++) {
				  if(a[i]>a[j]) {
					  temp = a[i];
					  a[i] = a[j];
					  a[j] = temp;
				  }
			  }
		  }
		  return a[total - 2];
		  
	  }


}
