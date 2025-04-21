package objectOrientedExamples;
class student{
	int rollno;
	String name;
	int mark1 , mark2 , mark3;
	int totalmark;
	
	void setdetails(int rollno ,String name ,int mark1 , int mark2 , int mark3 ) {
		this.rollno=rollno;
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
	}
	void calculatetotal(int totalmark) {
	
		totalmark=mark1+mark2+mark3;
		
	}
	void studentdetails() {
		System.out.println("rollno =" + rollno);
		System.out.println("name =" + name);
		System.out.println("Total Marks =" + totalmark);
		
	}
}
public class Assignment1_class {

	public static void main(String[] args) {
		student s= new student();
		s.setdetails(101 , "Bhagyashri" , 25 , 35, 30);
		s.calculatetotal(0);
		s.studentdetails();
		
	}

}
