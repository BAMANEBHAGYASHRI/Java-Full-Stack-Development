package Mypack;
import java.util.*;
class student{
	String name;
	int id;
	int marks;
	
	void print(String name , int id ,  int marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
}
public class test {

	public static void main(String[] args) {
		student s=new student();
		s.print(null, 0, 0);
	
	}

}
