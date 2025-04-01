package org.array.Examples;

public class SecondMaximuNumber_Array {

	public static void main(String[] args) {
		int a[]=new int[] {10,67,34,29,76,220,762};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int maxvalue=0;
		int secmaxval=0;
		for(int i=0;i<a.length;i++) {
			if(maxvalue<a[i]) {
				secmaxval=maxvalue;
				maxvalue=a[i];
			}
		}
		System.out.println("Maximun Value" + maxvalue);
		System.out.println("Second maximun Value" + secmaxval);

	}

}
