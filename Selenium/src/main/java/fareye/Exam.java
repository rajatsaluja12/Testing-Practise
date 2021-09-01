package fareye;

public class Exam {

	public static void main(String[] args) {
		String str = "match";
		str.toUpperCase();
		str+= "forCatch";
		String string = str.substring(2,13);
		string = string+str.charAt(4);
		System.out.println(string);
				

	}

}
