package Encapsulation;

public class MainStudent {
	public MainStudent() {
		Student s=new Student ();
		s.setID(12);
		s.setName("Bhagyashri");
		s.setAge(21);
		
		System.out.println(s.getId()+s.getName()+s.getage());
	}
	

}
