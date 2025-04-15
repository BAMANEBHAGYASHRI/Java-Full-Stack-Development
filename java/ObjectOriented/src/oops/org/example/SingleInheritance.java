package oops.org.example;

class basic{
	int no;
	void setvalue(int num) {
		no=num;
	}
	void getsquare() {
		int sqr=no*no;
		System.out.println("number of square" +sqr);
	}
	
}
class subclass extends basic{
	int getcube() {
		return no*no*no;
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		subclass sb=new subclass();
		sb.setvalue(6);
		sb.getsquare();
		sb.getcube();
		System.out.println("number of cube"+sb.getcube());
		
		
		
	
	}

}
