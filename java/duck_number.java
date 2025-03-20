import java.util.*;
class duck_number{
public static void main(String x[]){
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int rem , c=0;
while(num != 0){
	rem=num%10;
	if(num==0){
	    ++c;
                      
	}
	num=num/10;
	
}
if(c>0){
	System.out.println("Not Duck ");
}
else{
	System.out.println("Duck  number");
}
}

}