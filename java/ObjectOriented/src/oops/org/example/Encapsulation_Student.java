package oops.org.example;
class Student{
	private int  id;
	private String name;
	private String address;
	
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address=address;
	}
	public String getAdd() {
		return address;
	}

}

public class Encapsulation_Student {

	public static void main(String[] args) {
	Student s=new Student();
	s.setID(101);
	s.setName("Bhagyashri");
	s.setAddress("sangli");
	System.out.println(s.getID() +"\n"+s.getName()  +"\n" +s.getAdd());
	}

}
