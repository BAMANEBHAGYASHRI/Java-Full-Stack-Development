package Exception;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println("data is"+c);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("EXception occure");
		}
		

	}

}
