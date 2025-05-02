package oops.org.example;
import java.util.*;
class data_Emp{
	private int id;
	private String name;
	private String email;
	private int salary;
	
	public int getId() {
		return id;
	}
	public  void setID(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter id");
	    int id=sc.nextInt();
	    
	    System.out.println("Enter name");
	    String name=sc.next();
	    
	    System.out.println("Enter Email");
	    String email=sc.next();
	    
	    System.out.println("Enter salaray");
	    int salary=sc.nextInt();
	    
	    
	    data_Emp e=new data_Emp();
	    e.setID(id);
	    e.setName(name);
	    e.setEmail(email);
	    e.setSalary(salary);
	    
	    System.out.println(e.getId()+e.getName()+e.getEmail()+e.getSalary());
	    
	   
	}

}
