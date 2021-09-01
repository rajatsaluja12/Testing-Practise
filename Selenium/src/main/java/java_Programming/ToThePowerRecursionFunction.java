package java_Programming;

public class ToThePowerRecursionFunction {

	public static int power(int base, int powerRaised) {
		if(powerRaised!=0) {
			return(base * power(base,powerRaised-1));
		}
		else {
			return 1;
		}
	}
	
	
	public static void main(String[] args) {
		
		int base = 3; int powerRaised = 4;
		int result = power(base, powerRaised);
		System.out.println(base+"^"+powerRaised+"= "+result);
	
	}

}
