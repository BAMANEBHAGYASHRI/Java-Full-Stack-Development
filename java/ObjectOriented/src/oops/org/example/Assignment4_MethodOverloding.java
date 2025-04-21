package oops.org.example;
class MathOperation{
	void multiply( int a , double b) {
		System.out.println("Multiplication  " + (a*b));
	}
	void multiply( double c , int d) {
		System.out.println("Multiplication  " + (c*d));
	}
	void multiply( double e , double f) {
		System.out.println("Multiplication  " + (e*f));
	}
}
public class Assignment4_MethodOverloding {

	public static void main(String[] args) {
		MathOperation mo=new MathOperation();
		mo.multiply(3.4, 7.90);
		mo.multiply(23.3, 02);
		mo.multiply(43, 45.60);
	}

}
