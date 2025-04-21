package oops.org.example;
class Display{
	void show(int age) {
		System.out.println("Dispaly Interger  " + age);
		}
	void show(String name) {
		System.out.println("Display String  "+name);
	}
	void show(double percentage) {
		System.out.println("Display double   "+ percentage);
	}
}
public class Assignment3_MethodOverloading {

	public static void main(String[] args) {
		Display d=new Display();
		d.show(89.63);
		d.show("Bhagyashri");
		d.show(21);

	}

}
