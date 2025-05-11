package Mypack;
interface shape{
	void draw();
}
class circle implements shape{
	public void draw() {
		System.out.println("Drawing...");
	}
}
public class Interfaces {

	public static void main(String[] args) {
	shape s=new circle();
	s.draw();
	}

}
