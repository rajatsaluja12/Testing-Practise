package customException;

public class CustomException extends Exception {

	public CustomException() {
		super("Invalid nuumber.It should be between 1 and 10");
	}
	
	public CustomException(String message) {
		super(message);
	}
	

}
