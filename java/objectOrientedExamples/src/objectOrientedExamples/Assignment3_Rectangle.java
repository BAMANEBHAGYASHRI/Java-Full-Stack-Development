package objectOrientedExamples;
class Rectangle{
	int l ;
	int b;
	Rectangle(int l , int b){
		this.l=l;
		this.b=b;
	}
	void area() {
		int area=l*b;
		System.out.println("Area of Rectangle="+area);
	}
}
public class Assignment3_Rectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,9);
		r.area();

	}

}
