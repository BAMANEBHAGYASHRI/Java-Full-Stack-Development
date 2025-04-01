package org.array.Examples;

public class Insertion_Sort {

	public static void main(String[] args) {
		int a[]= {5,4,1,2,3,6};
		for(int i=0; i<a.length;i++) {
			int curr=a[i];
			int j=i-1;
			while(j>=0 && a[j]>curr) {
				a[j+1]=a[j];
				--j;
			}
			a[j+1]=curr;
		}
		for(int i=0; i<a.length;i++) {
			
			System.out.print(a[i] + " ");
		}

	}

}
