import java.util.*;
class elseifladder_Example{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Three Values");
int a = sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c){
System.out.println("A is Greater");
}
else if(b>a && b>c){
System.out.println("B  is Greater");
}
else{
System.out.println("C is Greater");
}



}

}