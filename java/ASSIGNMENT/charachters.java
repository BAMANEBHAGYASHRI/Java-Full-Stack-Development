import java.util.*;
class charachters{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Charachters");
char ch = sc.next().charAt(0);
switch(ch){
case  'a'  :
	System.out.println(ch + "- it Vowel");
	break;
case  'e'  :
	System.out.println(ch + " - it Vowel");
	break;
case   'i' :
	System.out.println(ch + " - it Vowel");
	break;
case  'o':
	System.out.println(ch + " - it Vowel");
	break;
case  'u' :
	System.out.println(ch+ " - it Vowel");
	break;
default :
	System.out.println(ch + " - it  Constant");
	break;
}

}

}