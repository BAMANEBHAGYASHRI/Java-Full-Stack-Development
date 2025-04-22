package oops.org.example;
class printer{
	void print(String s) {
		System.out.println("String="+s);
	}
	void print(int i) {
		System.out.println("Interger="+i);
	}
}
class colorprinter extends printer{
	void print(String s) {
		System.out.println("String="+s);
	}
}
public class Method_OverridingNoverloading {

	public static void main(String[] args) {
		printer p=new printer();
		p.print("shruti");
		p.print(21);
		
		colorprinter cp=new colorprinter();
		cp.print("bhagyashri");

	}

}
