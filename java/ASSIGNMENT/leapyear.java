import java.util.*;
class leapyear{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of year");
int year = sc.nextInt();
if((year% 4==0 &&  year% 100 != 0) || (year % 400 ==0)){
System.out.println(year + "-Is Leap year ");
}
else{

System.out.println(year + "-Is  not Leap year ");
}


}


}