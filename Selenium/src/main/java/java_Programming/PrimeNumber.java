package java_Programming;

public class PrimeNumber {

	public static void main(String[] args) {
		//1.Natural number >1
		//2.which has only 2 factor 1 and itself
		// 19 --> 1 and 19 --> Prime number 
		//28 -->  1,2,4,7, 14, 28 --> Not a Prime number 
		
		int num =3;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
				if(count==2) 
				{
					System.out.println("Prime number");
				}
				else {
						System.out.println("Not a prime number");
					}
					
			
			
		}else {
			System.out.println("Not a Prime number");
		}

		
		
		
	}
}



