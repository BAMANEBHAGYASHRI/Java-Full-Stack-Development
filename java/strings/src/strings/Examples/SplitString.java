package strings.Examples;

public class SplitString {

	public static void main(String[] args) {
		String s1=new String("Good Morning");
		String spl[]=s1.split("o");
		for(int i=0;i<spl.length;i++) {
			System.out.println(spl[i]);
		}
		

	}

}
