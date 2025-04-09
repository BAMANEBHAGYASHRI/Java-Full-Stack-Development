package oops.org.example;
import java.util.*;
class Prime{
	int no;
	void setValue(int no){
		this.no=no;
	}
	boolean isPrime(){
		if( no<=1) {
			return false;
		}
		for(int i=2 ; i<=no/2 ; i++) {
			if( no % i == 0) {
				return false;
			}
		}
		return true;
	}
}
public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter value");
	Prime  P =new Prime();
	int n=sc.nextInt();
	P.setValue(n);
	System.out.println(P.isPrime());
	
	}

}
