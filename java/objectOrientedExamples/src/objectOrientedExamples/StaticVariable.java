package objectOrientedExamples;
class Myclass{
	int m; //instance or non-sttic variable
	static int n;
	void xxx() {
		m=10;
		n=20;
	}
	static void yyy() {
//		m=30;
		n=40;
	}
	void display() {
		System.out.println(m+n);
		}
}
public class StaticVariable {

	public static void main(String[] args) {
		Myclass m=new Myclass();
		m.xxx();
		m.display();
		m.yyy();
		m.display();

	}

}
