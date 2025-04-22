package oops.org.example;
class vehicle_Example{
	void movie() {
		System.out.println("Method of vechicle");
		}
}
class carsExample extends vehicle_Example{
	void movie() {
		System.out.println("car moves on roads");
		}
}
class boat extends vehicle_Example{
	void movie() {
		System.out.println("boat sails on water");
		}
}
public class MethodOverriding_Polymorphism {

	public static void main(String[] args) {
		vehicle_Example v = new vehicle_Example();
		v.movie();
		carsExample cx=new carsExample();
		cx.movie();
		boat b = new boat();
		b.movie();
		
		
//		shortcut method calling
//		new boat().movie();

	}

}
