import java.util.*;
class Table_forloop{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your value ---- ");
int  num = sc.nextInt();

for(int i =1; i<=10 ; i++){
	int tab=i* num;
	System.out.println( num + " *" + i + "=" + tab);	
}

}

}