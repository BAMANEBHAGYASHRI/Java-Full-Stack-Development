package oops.org.example;
import java.util.*;
class userdata{
	int a, b;
	void setValue(int a  , int b) {
		this.a=a;
		this.b=b;
	}
	int getAddition() {
		int c=a+b;
		return c;
	}
}
public class SecondClassExample {

	public static void main(String[] args) {
		userdata data= new userdata();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Values");
		int A1=sc.nextInt();
		int A2=sc.nextInt();
		
		data.setValue(A1, A2);
		System.out.println("Addition"+data.getAddition());
	
		

	}

}
