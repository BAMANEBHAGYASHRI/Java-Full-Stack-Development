package objectOrientedExamples;
class customer{
	int custid;
	String custname;
	String custaddress;
	
	customer(int custid , String custname, String custaddress ){
		this.custid=custid;
		this.custname=custname;
		this.custaddress=custaddress;
	}
	void display() {
		System.out.println("Customer id ="+custid);
		System.out.println("Custmer name=" +custname);
		System.out.println("Customer Address="+custaddress);
	}
}
class Customer_Account{
	int accid;
	String acctype;
	customer customer;
	int accbalance;
	
	Customer_Account(int accid ,String acctype , customer customer ,int accbalance){
		this.accid=accid;
		this.acctype=acctype;
		this.customer=customer;
		this.accbalance=accbalance;
	}
	void display() {
		System.out.println("Account id ="+accid);
		System.out.println("Account type=" +acctype);
		System.out.println("Customer details=");
		customer.display();
		System.out.println("Account balance ="+accbalance);
		
	}
	
}
public class Assignment5_CustomerApplication {

	public static void main(String[] args) {
		customer c =new customer(101,"bhagyashri","sangli");
		c.display();
		
		Customer_Account acc=new Customer_Account(101, "Saving", c , 3000);
		acc.display();

	}

}
