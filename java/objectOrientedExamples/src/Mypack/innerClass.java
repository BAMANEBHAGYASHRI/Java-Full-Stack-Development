package Mypack;
class outer{
	int m=10;
	class inner{
		void dosutff() {
			System.out.println("number is-"+m);
		}
	}
}
public class innerClass {

	public static void main(String[] args) {
		outer.inner obj=new outer(). new inner();
		obj.dosutff();

	}

}
