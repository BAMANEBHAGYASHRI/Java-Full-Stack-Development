package Exception;
import java.util.*;
class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String message) {
		super(message);
	}
}
class pwdChecker{
	public static void pwdChecker(String password) throws InvalidPasswordException{
		 		if (password.length() < 8) {
	            throw new InvalidPasswordException("Password must be at least 8 characters long.");
	        }

	        if (!password.matches(".*[A-Z].*")) {
	            throw new InvalidPasswordException("Password must contain at least one capital letter.");
	        }

	        if (!password.matches(".*\\d.*")) {
	            throw new InvalidPasswordException("Password must contain at least one digit.");
	        }

	        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
	            throw new InvalidPasswordException("Password must contain at least one special symbol.");
	        }
	}
}
public class Assignment3_InvalidPassword_Exception {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        try {
        	pwdChecker.pwdChecker(inputPassword);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }

        scanner.close();

	}

}
