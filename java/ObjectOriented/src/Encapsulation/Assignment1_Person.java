package Encapsulation;
class person{
	private int id;
	private String name;
	private String address;
	private int age;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getage() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("Negitive Number Found");
			
		}
		else {
			this.age=age;
		}
		
	}
	
}
public class Assignment1_Person {

	public static void main(String[] args) {
		person p=new person();
		p.setId(12);
		p.setName("shruti");
		p.setAddress("sangli");
		p.setAge(9);
		
		System.out.println(p.getId()+ "\t"+p.getName()+"\t"+p.getAddress()+"\t"+p.getage());
	}

}
