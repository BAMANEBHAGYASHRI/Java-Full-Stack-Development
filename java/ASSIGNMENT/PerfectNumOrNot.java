import java.util.*;
class PerfectNumOrNot{
public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Value");
	int n= sc.nextInt();
	int sum =0;
	for(int i=1; i<n; i++){
		if(n%i==0){
     			sum = sum+i;
		}

	}
	if(n ==sum){
		System.out.println("Perfect");
	}
	else{
		System.out.println("Not Perfect");
	}

}

}