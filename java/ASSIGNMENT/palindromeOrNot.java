import java.util.*;
class palindromeOrNot{
public static void main(String x[]){
Scanner sc= new Scanner(System.in);
int rem , s=0;
System.out.println("Enter you number");
int n =sc.nextInt();
int p=n;
while(n>0){
	rem=n%10;
	s=(s*10)+rem;
	n=n/10;
	
}
if(p ==s){
System.out.println("Palindrome");
}
else{
System.out.println("Not Palindrome");
}
}


}
