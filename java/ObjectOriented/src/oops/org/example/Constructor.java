package oops.org.example;
import java.util.*;
class userdata1{
	int a, b;
	userdata1(int a  , int b) {
		this.a=a;
		this.b=b;
	}
	int getAddition() {
		int c=a+b;
		return c;
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Values");
		int A1=sc.nextInt();
		int A2=sc.nextInt();
		userdata1 data= new userdata1(A1,A2);
		
		System.out.println("Addition"+data.getAddition());

	}

}
