class sum{
public static void main(String x[]){
int f0=0 , f1=1, fib;
for(int i=1; i<=10; i++){
       System.out.println(f0 + "\t");
       fib = f0+f1;
        f0=f1;
        f1=fib;
}
}
}