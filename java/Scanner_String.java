import java.util.*;
class Scanner_String{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Two Strings");
String str1 = sc.nextLine();
String str2 = sc.nextLine();
if(str1.length()>str2.length()){
System.out.println("String First is Greater than String Second");
}
else if (str1.length()< str2.length()){
System.out.println("String second is Greater than String First");
}
else{
System.out.println("String First and String Second are Equal");
}

}


}