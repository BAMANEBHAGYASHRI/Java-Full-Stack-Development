package oops.org.example;
import java.util.*;
class persons_del{
	 persons_del(String name, int age , String city){
		 this(name , age);
		 System.out.println("City is  "+city);
	 }
	 persons_del(String name , int age) {
		this(name);
		System.out.println("age is   " + age);
	}
	 persons_del(String name) {
		System.out.println("name is  "+ name);
	}
	
}
class superkeys extends persons_del{
	superkeys(String name , int age, String city){
		super(name,age,city);
	}
}
public class Assignment2_MethodOverloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name Age and City");
		String name=sc.next();
		int age=sc.nextInt();
		String city=sc.next();
		
		persons_del pd=new persons_del(name ,age ,city);
		
		
		 

	}

}
