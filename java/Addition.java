import java.util.Scanner; 
class Addition{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your two values");
int a = sc.nextInt();
int b = sc.nextInt();
int add = a+b;
System.out.println("Addition" + "--" + add);
}
}