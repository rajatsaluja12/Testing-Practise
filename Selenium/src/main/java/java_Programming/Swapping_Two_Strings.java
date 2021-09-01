package java_Programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class Swapping_Two_Strings {
	
	@Test(enabled = false)
	public void Swap2String() {
		
		String a = "Saluja";
		String b = "Rakshit";
		System.out.println("Before Swapping the two strings :"+a+ " "+b );
		
		a = a+b;//SalujaRakshit
		b =a.substring(0,a.length() -b.length());
		a = a.substring(b.length());
		System.out.println("After swapping"+a+" "+b);
	}
	
	
	@Test(enabled = false)
	public void SwapStrings(){
		
	String x = "World";
	String y = "Beautiful";
	System.out.println("Before the swapping of the string"+x+" "+y);
	x = x+y;
	y= x.substring(0,x.length()-y.length());
	x =x.substring(y.length());
	System.out.println("Afterthe swapping of the string"+x+" "+y);
		
	}
	
	@Test(enabled = false)
	public void Swapno() {
		int a1 = 10;
		int a2 = 20;
		System.out.println("Before swapping the number"+a1+" "+a2);
		
		a2 = (a1-a2 +(a1=a2));
		System.out.println("After the swapping the number "+a1+" "+a2);
		
	}
	
	@Test
	public void RemoveJunk() {
		
		String str = "&$%&#%^*# rakshit is wbefirty 7937793";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after removing the junk values "+str);
		
	}
	
	@Test
	public void RemoveWhiteSpace() {
		String str = "The World is    beautiful   ";
		str = str.replaceAll("\\s", "");
		System.out.println("Removing the white spaces from the string "+str);
		
	}
	
	@Test 
	public static String ReverseEachword(String stringg) {
		
		String[] str = stringg.split("Committing to work");
		String reversword = "";
		for(String sstring : str) {
			StringBuffer sb1 = new StringBuffer(sstring);
			sb1.reverse();
			reversword = reversword+ sb1.toString()+" ";
		}
		return reversword.trim();
	}
	
	@Test
	public void callingReverseeachword() {
		System.out.println(Swapping_Two_Strings.ReverseEachword("Committing to work"));
	}
	
	
	@Test(enabled = false)
	public void Pallindromeno() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int numb = sc.nextInt();
		int org_numb = numb;
		int rev = 0;
		while(numb !=0) {
			rev = rev*10+ numb%10;
			numb = numb/10;
			
		}
		System.out.println("Reversed no. is :"+rev);
		if(org_numb ==rev) {
			System.out.println("The no. is pallindrome ");
		}
		else {
			System.out.println("The no. not is pallindrome");
		}
	}
	
	
	
	@Test
	public void pallindromeString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int len = str.length();
		String rev = "";
		String org_str = str;
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i)+"";
		}
		System.out.println("The String is reversed "+rev);
		if(org_str.equals(rev)) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not pallindrome");
		}
	}

	
@Test
public void primenumber() {
	
	int num = 3;
	int count = 0;
	if(num>1) {
		for(int i=1;i<num; i++) {
			if(num%i==0) {
				count++;
			}
			if(count==2) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("It is not a prime number ");
			}
		}
	}
	else {
		System.out.println("It is not a prime number");
	}
}

@Test
public void fibonnaciSeries() {
	int n1 = 0, n2=1, sum=0;
	System.out.println(n1+""+n2);
	for(int i=2;i<10;i++) {
		sum = n1+n2;
		System.out.println(""+sum);
		n1=n2;
		n2=sum;
	}
	
}

@Test
public void factorial() {
	int fact = 3;
	int num = 5;
	for(int i =1;i<num;i++) {
		fact = fact *i;
		
	}System.out.println("factorial of"+num+"is : "+fact);
}


static int factorial(int n) {
	if(n==0) {
		return 0;
	}
	else {
		return (n*factorial(n-1));
	}
}

@Test
public void factorialrecursion() {
	int num = 5;
	int fact = 1;
	fact = factorial(num);
	System.out.println("Factorial of the "+num+""+fact);
}


	
	@Test
	public void EvenOddFromArray() {
		
		int a[] = {1,2,3,5,6,7,8,9};
		System.out.println("Even no. in array....");
		for(int numb : a) {
			if(numb%2 == 0) 
				System.out.println("It is an even no. "+numb);
			}
			System.out.println("Even no. in array....");
			for(int numb :a) {
				if(numb%2 !=0)
					System.out.println("Odd no. "+numb);
			
		}
	}
	
	
	@Test
	public static void duplicateCharacterinString(String str) {
		
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	char[] chArray = str.toCharArray();
	for(char c : chArray ) {
		if(map.containsKey(c)){
			map.put(c, map.get(c)+1);
			
		}
		else {
			map.put(c, 1);
		}
	
	}
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
		
	}
	
	@Test
	public void callingDuplicaCharaterinString() {
		String str = "Rakshit";
		duplicateCharacterinString(str);
	}
	
	
	
	
}
