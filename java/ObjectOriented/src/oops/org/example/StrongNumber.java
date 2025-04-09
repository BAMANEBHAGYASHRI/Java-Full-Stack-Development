package oops.org.example;
import java.util.*;
class Strong{
	 int num;

	    void setValue(int num) {
	        this.num = num;
	    }

	    int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    void isStrong() {
	        int temp = num;
	        int sum = 0;

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += factorial(digit);
	            temp = temp / 10;
	        }

	        if (sum == num) {
	            System.out.println(num + " is a Strong Number");
	        } else {
	            System.out.println(num + " is NOT a Strong Number");
	        }
	}
}
public class StrongNumber {
	public static void main(String[] args) {
		Strong sn=new Strong();
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		sn.setValue(no);
		sn.isStrong();
		

	}

}
