package org.array.Examples;

public class MaXimun_Number_Array {

	public static void main(String[] args) {
		int a[]= new int[] {20,89,12,19,15,100};
		int max=0;
		for (int i=0; i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.print("Maximun Number --" + max);

	}

}
