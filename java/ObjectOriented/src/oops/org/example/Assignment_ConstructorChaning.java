package oops.org.example;
class person{
	person(String name){
		System.out.println("Name is-"+name);
	}
}
class Employeess extends person{

	Employeess(String name , int  EmpId) {
		super(name);
		System.out.println("Employee id -" + EmpId);
		
	}
	
}
public class Assignment_ConstructorChaning {

	public static void main(String[] args) {
		Employeess  e= new Employeess("bhagyashri" ,105);

	}

}
