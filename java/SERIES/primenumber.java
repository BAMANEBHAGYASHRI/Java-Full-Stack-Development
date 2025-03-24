class  primenumber{
public static void main(String x[]){
int n;
for(int i=1; i<=25; i++){
int c=0;
for(int j=1; j<i ; j++){
if(i%j==0){
c++;
}
}
if(c<2){
System.out.print(i+"\t");
}
}

}

}