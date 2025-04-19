package oops.org.example;
class cal{
	cal(){
		this(2,4);
		System.out.println("This is dfault constructor");
	}
	cal(int a , int b){
		this(3.2f , 6.2f);
		System.out.println("Addition" + (a+b));
	}
	cal(float c , float d){
		System.out.println("Multiplication" + (c*d));
	}
}
public class ThisKeyword_Inheritance {

	public static void main(String[] args) {
		new cal();

	}

}
