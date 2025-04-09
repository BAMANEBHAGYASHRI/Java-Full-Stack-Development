package oops.org.example;
import java.util.*;
class DigitCount{
	int num;
	
	void setvalue(int num) {
		this.num=num;
	}
	void getDIgitalCount() {
		int count=0;
		int temp=num;
		
		if(temp==0) {
			count=1;
		}
		else {
			while(temp !=0) {
				temp=temp/10;
				count++;
			}
		}
		System.out.println("Number of digit"+ num + "is" + count);
	}
	
}
public class DigitNumber {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter values");
		int n=sc.nextInt();
		DigitCount dc=new DigitCount();
		dc.setvalue(n);
		dc.getDIgitalCount();
		
	}

}
