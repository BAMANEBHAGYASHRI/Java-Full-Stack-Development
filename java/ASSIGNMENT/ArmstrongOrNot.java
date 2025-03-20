import java.util.*;
class ArmstrongOrNot{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number");
	int num = sc.nextInt();
	int rem,arm=0;
	
	int c=num;
	while(num>0){
		rem=num%10;
		arm=(rem*rem*rem)+arm;
		num=num/10;
	}
	if(c==arm){
		System.out.println("Armstrong number");
	}
	else{
		System.out.println("Not Armstrong number");
	}


	}



}