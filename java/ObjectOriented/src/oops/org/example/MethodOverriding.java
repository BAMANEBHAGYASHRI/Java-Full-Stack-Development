package oops.org.example;
class area_ofcircle{
	void area(float radius) {
		float a=3.14f*radius*radius;
		System.out.println("Area of Circle  "+a);
	}
}
class areaOf_Square extends area_ofcircle{
	void area(int side) {
		int area=side*side;
		System.out.println("Area of Square  "+area);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		area_ofcircle c= new area_ofcircle();
		c.area(3);
		
		areaOf_Square as= new  areaOf_Square();
		as.area(4);
		
		

	}

}
