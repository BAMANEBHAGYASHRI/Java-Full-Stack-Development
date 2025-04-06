package org.array.Examples;
import java.util.*;
public class Assignment_InsertingValue_Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[a.length+1];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
			
		System.out.println("Enter item values");
		int index=sc.nextInt();
		System.out.println("Enter index value");
		int value=sc.nextInt();
		b[index]=value;
		for(int i=0;i<index;i++) {
			b[i]=a[i];
		}
		for(int i=index;i<b.length;i++) {
			b[i]=a[i-1];
			
		}
		System.out.println("Display array");
		for(int i=0 ; i<b.length;i++) {
			System.out.print(b[i] + "\t");
		}
	}

}
