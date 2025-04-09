package oops.org.example;
import java.util.*;
class Armstrong{
	int num;
	
	void setvalue(int num) {
		this.num=num;
	}
	void IsArmstrong() {
		int rem , count=0 ;
		while(num>0) {
			rem = num%10;
			count=(rem*rem*rem)+count;
			num=num/10;
		}
		if(count == num) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not ArmStrong");
		}
	}
}
public class ArmStrongNumber {

	public static void main(String[] args) {
		Armstrong as= new Armstrong();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		as.setvalue(n);
		as.IsArmstrong();
		

	}

}
