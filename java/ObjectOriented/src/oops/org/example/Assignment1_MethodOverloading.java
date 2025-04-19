package oops.org.example;
class calcultors{
	void add(int a , int b){
		System.out.println("Two integer value --" +(a+b));
	}
	void add(int c, int d, int e) {
		System.out.println("three integer value --" + (c+d+e)) ;
	}
	void add(double f , double g) {
		System.out.println("Two double value --" +(f+g));
	}
}
public class Assignment1_MethodOverloading {

	public static void main(String[] args) {
	calcultors cs=new calcultors();
	cs.add(4.4, 0.67);
	cs.add(2, 40);
	cs.add(2, 3, 5);
	}

}
