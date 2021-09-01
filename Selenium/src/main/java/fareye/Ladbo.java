package fareye;

class Exc0 extends Exception{
	
};
class Exc1 extends Exc0{
	
}

public class Ladbo {


	
	public static void main(String[] args) {
try {
	throw new Exc1();
}
catch(Exc0 e0) {
	System.out.println("Exc0 is caught");
}
catch(Exception e) {
	System.out.println("exception caught");
}
		
	}
	

}
