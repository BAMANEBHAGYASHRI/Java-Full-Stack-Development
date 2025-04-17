package oops.org.example;
interface Animal{
	void eat();
}
interface flying{
	void fly();
}
class bat implements Animal , flying{
	public void eat(){
		System.out.println("Eating..");
	}
	public void fly(){
		System.out.println("Flying..");
	}
}
public class Assignment_MultipleINheritanceWInterface {

	public static void main(String[] args) {
		bat b=new bat();
		b.eat();
		b.fly();

	}

}
