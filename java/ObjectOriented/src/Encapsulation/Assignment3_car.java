package Encapsulation;
class car{
	private String brand;
	private int speed;
	private int fuel;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		if(fuel>=0) {
			this.fuel=fuel;
		}
		else {
			System.out.println("Fuel cannot  be negative");
		}
		
	}
}
public class Assignment3_car {

	public static void main(String[] args) {
		car c=new car();
		c.setBrand("auteee");
		c.setFuel(78);
		c.setSpeed(7833);
		
		System.out.println(c.getBrand()+c.getFuel()+c.getSpeed());

	}

}
