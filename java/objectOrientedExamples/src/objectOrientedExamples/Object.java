package objectOrientedExamples;
class employee{
	int empid;
	String name;
	double empsalary;
	
	void details() {
		empid=101;
		name="bhagyashri";
		empsalary=898700;
	}
	
	void Print() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(empsalary);
		
	}
}
public class Object {

	public static void main(String[] args) {
		employee em=new employee();
		em.details();
		em.Print();
		
		employee em1=new employee();
		em1.Print();
		
	}

}
