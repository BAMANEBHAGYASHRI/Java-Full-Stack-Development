package strings.Examples;

public class stringInBuiltFunction {

	public static void main(String[] args) {
		
		//length function
		String s1=new String("Good MOrning Everyone!!");
		System.out.println("Length of Srting" + "  " + s1.length());
		
		//charAt()Function
		System.out.println("Fetch Single Charachter" + s1.charAt(5));
		//Print the  All string using For loop
		for (int i=0 ; i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
