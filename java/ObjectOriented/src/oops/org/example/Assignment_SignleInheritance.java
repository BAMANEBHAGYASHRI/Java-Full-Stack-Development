package oops.org.example;
class vehicle{
	void start(){
		System.out.println("Vehicle is starting");
	}
}
class car extends vehicle{
	void drive() {
		System.out.println("car is driving");
	}
}
public class Assignment_SignleInheritance {

	public static void main(String[] args) {
		car c= new car();
		c.drive();
		c.start();
	}

}
