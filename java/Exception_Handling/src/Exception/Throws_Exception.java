package Exception;
class test{
	void getTest(int a, int b) throws Exception{
		int c=a/b;
		System.out.println("Division is "+c);
	}
}
public class Throws_Exception {

	public static void main(String[] args) {
	try {
		test t=new test();
		t.getTest(10, 0);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
