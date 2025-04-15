package oops.org.example;
class prime{
	int no;
	void setvalue(int num) {
		no=num;
	}
	void TestPrime() {
		boolean  b=false;
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println("NUmber is not prime");		
		}
		else {
			System.out.println("NUmber is  prime");
		}
	}
}
class duck extends prime{
	int rem;
	boolean b=false;
	void TestDuck() {
		while(no!=0) {
			rem = no%10;
			no= no/10;
			if(rem==0) {
				b=true;
			}
		}
		if(b) {
			System.out.println("Number in duck");
		}
		else {
			System.out.println("Number is not duck");
		}
	}
}
class palindrome extends duck{
	void reverse() {
		int temp , rev=0, rem;
		temp=no;
		while(no!=0) {
			rem = no%10;
			no = no/10;
			rev=rev*10+rem;
		}
		if(rev==temp) {
			System.out.println("number is palidrome");
		}
		else {
			System.out.println("number is not  palidrome");
		}
	}
}
public class HirarechicalInheritance {

	public static void main(String[] args) {
		palindrome p=new palindrome();
		p.setvalue(131);
		p.TestPrime();
		p.reverse();
		duck d= new duck();
		d.setvalue(121);
		d.TestDuck();
		

	}

}
