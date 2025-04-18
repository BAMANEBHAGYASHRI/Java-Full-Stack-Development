package oops.org.example;
class shapeess{
	void calculate_area(float r) {
		float area=3.14f*r*r;
		System.out.println("Area of circle-"+area);
	}
	void calculate_area(int l , int w) {
		int area= l*w;
		System.out.println("Area of Rectangle - "+area);
	}
}
public class MethodOverloading_PolymorphismExample {

	public static void main(String[] args) {
		shapeess s=new shapeess();
		s.calculate_area(3);
		s.calculate_area(3, 20);

	}

}
