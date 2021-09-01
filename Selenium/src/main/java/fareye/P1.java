package fareye;

public class P1 {

	public static void main(String[] args) {
		String obj1 = new String("abcd");
		String obj2 = new String("abcd");
		
		if(obj1.hashCode() == obj2.hashCode()) {
			System.out.println("Rakshit");
		}
		if(obj1==obj2) {
			System.out.println("Rajat");
		}
		if(obj1.equals(obj2)) {
			System.out.println("Mahima");
		}
		

		
		System.out.println(Math.floor(-4.7));
		System.out.println(Math.round(-4.7));
		System.out.println(Math.ceil(-4.7));
		//System.out.println(Math.min(-4.7));
		
		
		
	}

}
