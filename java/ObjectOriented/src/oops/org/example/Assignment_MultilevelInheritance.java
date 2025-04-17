package oops.org.example;
class plant{
	void eat() {
		System.out.println("Eat method in plant");
	}
}
class tree extends plant{
	void walk() {
		System.out.println("walk method in tree");
	}
}
class leaves extends tree{
	void bark() {
		System.out.println("bark method in leaves");
	}
}
public class Assignment_MultilevelInheritance {

	public static void main(String[] args) {
		leaves l=new leaves();
		l.eat();
		l.walk();
		l.bark();

	}

}
