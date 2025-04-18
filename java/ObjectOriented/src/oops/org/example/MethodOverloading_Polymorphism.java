package oops.org.example;
class poly{
	void sum(int a, int b) {
		int c =a+b;
		System.out.println(c);	
		}
	void sum(float c , float d) {
		float e=c+d;
		System.out.println(e);
	}
}
public class MethodOverloading_Polymorphism {

	public static void main(String[] args) {
		poly p=new poly();
		p.sum(4, 02);
		p.sum(2.7f, 2.9f);

	}

}
