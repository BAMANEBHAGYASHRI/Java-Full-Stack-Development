package Exception;
class VoterException extends RuntimeException{
	public String getvoter() {
		return "age is less than 18";
	}
}
class vottingMachine{
	void checkAge(int age) {
		if(age<18) {
			 VoterException ve=new  VoterException();
			 throw ve;
		}
		else {
			System.out.println("Valid Age");
		}
	}
}
public class UserDefined_Exception {

	public static void main(String[] args) {
		try {
			vottingMachine vm=new vottingMachine();
			vm.checkAge(10);
		}
		catch(VoterException e) {
			System.out.println(e.getvoter());
		}

	}

}
