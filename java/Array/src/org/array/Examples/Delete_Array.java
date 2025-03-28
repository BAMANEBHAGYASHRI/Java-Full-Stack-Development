package org.array.Examples;
import java.util.*;
public class Delete_Array {

	public static void main(String[] args) {
		int size, loc;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Array Size");
		size = sc.nextInt();
		
		int a[]=new int[size];
		System.out.print("Enter Array Elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Array location");
		loc=sc.nextInt();
		
		for(int i=loc; i<size;i++) {
			a[i]=a[i+1];
		}

		size--;
		for(int i=0; i<size;i++) {
			System.out.print(a[i] + " " );
		}
	}

}
