package org.array.Examples;

public class Array_Occurance {

	public static void main(String[] args) {
		int a[]= {1,2,4,2,4,1,5,6,3,3,6};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int i,j;
		for( i=0;i<a.length;) {
			int c=1;
			for( j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
				else {
					break;
				}
			}
				System.out.println(a[i] +  " "+"Occurs-" +" "+ c  +" "+ "times");
				i=j;
			}
		
	}

}
