package Exception;
class  InvalidEmailFormatException extends Exception{
	public InvalidEmailFormatException(String  msg) {
		super(msg);
	}
}
public class Assignment1_EmailFormatException {
	public static void checkEmail(String email) throws InvalidEmailFormatException{
		if(!email.contains("@") || !email.contains(".")) {
			throw new InvalidEmailFormatException("email must contains @ and .");
		}
		
		int atIndex=email.indexOf('@');
		if(email.lastIndexOf('@') !=atIndex) {
			throw new InvalidEmailFormatException("email must contains @ ");
		}
		
		int lastDot=email.indexOf('.');
		if(lastDot ==-1 || lastDot<atIndex) {
			throw new InvalidEmailFormatException("dot must be present after @ ");
		}
		
		String domainsuffix=email.substring(lastDot+1);
		if(!(domainsuffix.length()==2 ||domainsuffix.length()==3)) {
			throw new InvalidEmailFormatException("domain after alst dot must be 2 and 3  charachters ");
		}
		System.out.println("valid email" + email);
	}
	public static void main(String[] args) {
		try {
			checkEmail("example@domain.com");
        } catch (InvalidEmailFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
