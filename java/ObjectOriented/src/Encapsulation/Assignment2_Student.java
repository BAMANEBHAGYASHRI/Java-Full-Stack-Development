package Encapsulation;

class students {
	private int rollno;
	private String name;
	private double marks;
	
	
	public int getRollNo() {
		return rollno;
	}
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getmarks() {
		return marks;
	}
	public void setmarks(double marks) {
		this.marks=marks;
	}
	
	public String getGrade() {
		if(marks>=90) {
			return "A";
		}
		else if(marks>=75) {
			return "B";
		}
		else if(marks>=60) {
			return "C";
		}
		else {
			return "F";
		}
	}
}

public class Assignment2_Student {

	public static void main(String[] args) {
		students s=new students();
		s.setName("bhagyashri");
		s.setRollNo(21);
		s.setmarks(98.79);
		
		System.out.println(s.getRollNo()+s.getName()+s.getmarks());
		System.out.println("grade is"+s.getGrade());

	}

}
