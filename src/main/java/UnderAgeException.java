
public class UnderAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4387563130738037824L;

	/**
	 * 
	 */
	public UnderAgeException() {
		super("Parent is too young!");
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnderAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message) {
		super(message);
	}

	
	
}
