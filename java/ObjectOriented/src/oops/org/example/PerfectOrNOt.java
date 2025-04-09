package oops.org.example;

import java.util.Scanner;

class Perfect{
	int  num  , sum;
	void setValue(int num) {
		this.num=num;
	}
	void PerfectNum(){
		sum=0;
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("Perfect Number" + num);
		}
		else {
			System.out.println("Not Perfect Number");
		}
	}
}
public class PerfectOrNOt {

	public static void main(String[] args) {
		Perfect pr=new Perfect();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Values");
		int a=sc.nextInt();
		pr.setValue(a);
		pr.PerfectNum();

	}

}
