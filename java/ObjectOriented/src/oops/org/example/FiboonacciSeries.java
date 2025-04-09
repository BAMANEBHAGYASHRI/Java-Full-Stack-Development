package oops.org.example;
import java.util.*;
class Fibonacci{
	int limit;
	void setlimit(int limit) {
		this.limit=limit;
	}
	void showFibo(){
		int f1=0 , f2=1;
		System.out.println("Fibonacci Series up to " + limit + " terms:");
		for(int i=1; i<=limit;i++) {
			 System.out.print(f1 + " ");
			int next=f1+f2;
			f1=f2;
			f2=next;
		}
		System.out.println();
	}
}
public class FiboonacciSeries {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		int n=sc.nextInt();
		fb.setlimit(n);
		fb.showFibo();

	}

}
