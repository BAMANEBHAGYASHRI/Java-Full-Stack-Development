import java.util.*;
class Reverse_Whileloop{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your value");
int num = sc.nextInt();
int rem , rev=0;
while(num != 0){
	rem = num%10;
	num = num/10;
	 rev = (rev * 10) +rem;
}
System.out.println("Reverse number is --" + rev);


}


}