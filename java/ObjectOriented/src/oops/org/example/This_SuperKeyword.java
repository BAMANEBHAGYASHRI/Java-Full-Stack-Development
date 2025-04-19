package oops.org.example;
class calculation{
//	calculation(){
//		this(2,4);
//		System.out.println("This is default constructor");
//	}
	calculation(int a , int b){
		this(3.2f , 6.2f);
		System.out.println("Addition" + (a+b));
	}
	calculation(float c , float d){
		System.out.println("Multiplication" + (c*d));
	}
}
class  superkey extends calculation{
	superkey(int a , int b){
		super(a,b);
	}
}
public class This_SuperKeyword {

	public static void main(String[] args) {
		superkey sk=new superkey(8,2);

	}

}
