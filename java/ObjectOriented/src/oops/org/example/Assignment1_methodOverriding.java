package oops.org.example;
class Vehicledata{
	void startEngine() {
		System.out.println("StartEngine method in Vehicle");
	}
}
class Cardata extends Vehicledata{
	 void startEngine() {
		System.out.println("StartEngine method in Car") ;
		super.startEngine();
//		System.out.println("car in staring");
	}
}

public class Assignment1_methodOverriding {

	public static void main(String[] args) {
		new Vehicledata().startEngine();
		new Cardata().startEngine();
		

	}

}
