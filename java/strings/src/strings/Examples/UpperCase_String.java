package strings.Examples;

public class UpperCase_String {

	public static void main(String[] args) {
	String s1= new String("good morning!!");
	char ch;
	for(int i=0; i<s1.length();i++) {
		char c=s1.charAt(i);
		if(c>='a' && c<= 'z') {
			ch=(char)(c-32);

		}
		else {
			ch=c;
//			System.out.println(ch);
		}
	System.out.print(ch);
	}
	}

}
