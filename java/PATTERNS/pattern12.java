class pattern12{
public static void main(String x[]){
int n=5;
for(int i=1; i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
int space=2*(n-i);
for(int j=1; j<=space;j++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}

}
}
/*
*        *
**      **
***    ***
****  ****
**********
*/