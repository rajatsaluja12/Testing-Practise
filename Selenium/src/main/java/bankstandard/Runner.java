package bankstandard;



public class Runner {

	public static void main(String[] args) {
		
		String buggycode_var_01 = "Buggy Code";
		String buggycode_var_02 = "Buggy Code";
		if(buggycode_var_01==buggycode_var_02)
			System.out.println("first set of string are equal");
		
		String bettercode_var_01 = new String("Better Code");
		String bettercode_var_02 = new String("Better Code");
		if(bettercode_var_01==bettercode_var_02)
			System.out.println("Second set of string are equal");

	}

}
