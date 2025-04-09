package oops.org.example;
import java.util.*;
class Palindrome{
	int  num, count, pd=num; 
	void setvalue( int num){
		this.num=num;
	}
	void isPalindrome() {
		int rem;
		while(num>0) {
			rem=num%num;
			count=(count*10)+rem;
			num=num/10;
		}
		if(pd==num) {
			System.out.println("Number Is Palindrome");
		}
		else {
			System.out.println("Number Is Not Palindrome");
		}
	}
}
public class PalindromOrNot {

	public static void main(String[] args) {
		Palindrome pd= new Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values");
		int no=sc.nextInt();
		pd.setvalue(no);
		pd.isPalindrome();
	}

}
