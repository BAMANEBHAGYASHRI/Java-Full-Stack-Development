package oops.org.example;
class shape{
	void shape() {
		System.out.println("Arae method in shape class");
	}
	
}
class circle extends shape{
	double r;
	circle(double r){
		this.r=r;
	}
	void area() {
		double area= 3.14*r*r;
		System.out.println("Area of circle--"+area);
	}
}
class Rectangle extends shape{
	double l ,w;
	Rectangle(double l , double  w){
		this.l=l;
		this.w=w;
	}
	void area() {
		double area=l*w;
		System.out.println("Area of Rectangle--" + area );
	}
}
public class Assignement_OverriddenMethods {

	public static void main(String[] args) {
		circle s1=new circle(5.3);
		Rectangle s2=new Rectangle(3.6,7.0);
		s1.area();
		s2.area();
		
		

	}

}
