package Exception;

public class NullPointerException {

	public static void main(String[] args) {
		int a[]=null;
		try {
			System.out.println(a[0]);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
