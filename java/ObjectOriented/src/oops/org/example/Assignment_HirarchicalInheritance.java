package oops.org.example;
class $vehicless{
	void start() {
		System.out.println("car is starting..");
	}
}
class cars extends  $vehicless{
	void drive() {
		System.out.println("car is driving..");
	}
}
class bike extends $vehicless{
	void ride() {
		System.out.println("bike is riding..");
	}
}
public class Assignment_HirarchicalInheritance {

	public static void main(String[] args) {
		bike b=new bike();
		b.start();
		b.ride();
		
		car c= new car();
		c.drive();
		c.start();
		
		

	}

}
