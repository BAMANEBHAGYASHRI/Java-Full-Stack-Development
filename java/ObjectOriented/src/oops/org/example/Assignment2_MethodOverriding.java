package oops.org.example;
class Shapes{
	void draw() {
		System.out.println("We can Draw the shapes");
	}
}
class Circle extends Shapes{
	void draw() {
		System.out.println("Drawing the circle");
	}
}
class Rectangles extends Shapes{
	void draw() {
		System.out.println("Drawing the Rectangle");
	}
}
class Triangles extends Shapes{
	void draw() {
		System.out.println("Drawing the  Triangles");
	}
}
public class Assignment2_MethodOverriding {

	public static void main(String[] args) {
		new Shapes().draw();
		new Circle().draw();
		new Rectangles().draw();
		new Triangles().draw();
		
		
		
		

	}

}
