package strings.Examples;

public class StringOccurance {

	public static void main(String[] args) {
		String str="hello world";
		int c =1 , i , j;
		char ch[] =str.toCharArray();
		for( i=0; i<ch.length;i++) {
			for(j=i+1; j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(i=0 ;i<ch.length;) {
			for(j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
				}
				else {
					break;
				}
			}
			System.out.println(ch[i] +"\t"+  c);
			i=j;
			c=1;
		}
		}
		

}
