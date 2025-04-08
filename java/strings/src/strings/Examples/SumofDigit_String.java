package strings.Examples;

public class SumofDigit_String {

	public static void main(String[] args) {
		String str="a1b2c3d9";
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			
			if( ch >=  '0' && ch<= '9') {
				sum  += ch - '0';
			}
		}
		System.out.println( "Sum of  digit in String " + sum);

	}

}
