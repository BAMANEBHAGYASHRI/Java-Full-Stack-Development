package oops.org.example;
class value{
	int fv , sv;
	void setvalue(int a , int b) {
		fv=a;
		sv=b;
	}
}
class Add extends  value{
	void getaddition() {
		int sum=fv+sv;
		System.out.println("Addition is - "+ sum);
	}
}
class sub extends  Add{
	void getSubstraction() {
		int sub=fv-sv;
		System.out.println("Substraction is - "+ sub);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		sub s= new sub();
		s.setvalue(4, 7);
		s.getSubstraction();
		s.getaddition();

	}

}
