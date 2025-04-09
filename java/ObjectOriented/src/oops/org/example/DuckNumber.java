package oops.org.example;
import java.util.*;
class Duck{
	int num;

    void setvalue(int num) {
        this.num = num;
    }

    void isDuck() {
        int rem;
        int temp = num;
        boolean isDuck = false;

        while (temp > 0) {
            rem = temp % 10;
            if (rem == 0) {
                isDuck = true;
                break;
            }
            temp= temp/10;
        }

      
        if (isDuck) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not Duck number");
        }
	}
	
}
public class DuckNumber {

	public static void main(String[] args) {
		Duck dc=new Duck();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values");
		int n=sc.nextInt();
		dc.setvalue(n);
		dc.isDuck();

	}

}
