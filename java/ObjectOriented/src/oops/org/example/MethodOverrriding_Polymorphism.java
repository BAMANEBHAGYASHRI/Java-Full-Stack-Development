package oops.org.example;
import java.util.*;
class number{
	void calculatevalue(int num) {
		System.out.println("Number is="+num);
	}
}
class squareFind extends number{
	void calculatevalue(int num) {
		System.out.println("Square is="+(num*num));
	}
}

class cubeFind extends number{
	void calculatevalue(int num) {
		System.out.println("cube is="+(num*num*num));
	}
}
class fourthvalueFind extends number{
	void calculatevalue(int num) {
		System.out.println("Fourth value is="+(num*num*num*num));
	}
}

public class MethodOverrriding_Polymorphism {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter values =");
		int a=sc.nextInt();
		number n=new number();
		new squareFind().calculatevalue(a);
		new cubeFind().calculatevalue(a);
		new fourthvalueFind().calculatevalue(a);
		

	}

}
