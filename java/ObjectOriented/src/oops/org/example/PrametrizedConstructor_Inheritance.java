package oops.org.example;
class square{
	square(int no){
		System.out.println("sqaure is" + (no*no));
		}
}
class cube extends square{
	cube(int no , int x){
		super(no);
		System.out.println("cube is " + (x*x*x));
	}
}
public class PrametrizedConstructor_Inheritance {

	public static void main(String[] args) {
		cube c= new cube(5,2);

	}

}
