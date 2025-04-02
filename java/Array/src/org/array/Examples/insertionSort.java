package org.array.Examples;

public class insertionSort {

	public static void main(String[] args) {
		int a[]=new int[] {90,10,129,23,39,15};
		for(int i=0; i<a.length-1;i++) {
			int j=i;
			while(j>0 && a[j-1]>a[j]) {
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
		System.out.println("Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
		
	}

}
