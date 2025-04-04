package strings.Examples;

public class LowerCase_String {

	public static void main(String[] args) {
		String s1=new String("GOOD MORNING!!");
		char ch;
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c>='A'  && c <= 'Z') {
				ch=(char)(c+32);
			}
			else {
				ch=c;
			}
			System.out.print(ch);
		}
	}

}
 