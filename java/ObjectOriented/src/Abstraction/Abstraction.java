package Abstraction;
abstract class demo{
	int a, b;
	void setvalue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	abstract void getAddition();
}
class Example extends demo{
	 @Override
	void getAddition() {
		int c=a+b;
		System.out.println("Addition="+c);
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Example e=new Example();
		e.setvalue(10, 10);
	    e.getAddition();

}
}
