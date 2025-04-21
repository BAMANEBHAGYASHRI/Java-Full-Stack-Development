package objectOrientedExamples;
class Account{
	int accNo;
	String acctype;
	int accbalance;
	
	void setAccountDetails(int accNo, String acctype, int accbakance){
		this.accNo=accNo;
		this.acctype=acctype;
		this.accbalance=accbalance;
	}
	void withdraw(int amount) {
		if(amount <= accbalance) {
			accbalance -= amount;
			System.out.println("Withdraw="+amount);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	void deposit(int amount) {
		accbalance +=amount;
		System.out.println("Deposited="+amount);
	}
	void disaccountdetails() {
		 System.out.println("Account Number: " + accNo);
	        System.out.println("Account Type: " + acctype);
	        System.out.println("Account Balance: " + accbalance);
	}
}
public class Assignment2_BankApplication {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountDetails(1001, "Saving",4000);
		acc.deposit(1500);
		acc.withdraw(2000);
		acc.disaccountdetails();

	}

}
