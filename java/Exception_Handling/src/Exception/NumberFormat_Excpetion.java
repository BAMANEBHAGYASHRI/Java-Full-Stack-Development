package Exception;

public class NumberFormat_Excpetion {

	public static void main(String[] args) {
		String s="1234 ";
		try {
			int a=Integer.parseInt(s);
			System.out.println(a);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception occur");
		}

	}

}
