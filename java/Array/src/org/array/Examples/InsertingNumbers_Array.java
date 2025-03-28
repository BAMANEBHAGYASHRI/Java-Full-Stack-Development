package org.array.Examples;
import java.util.*;
public class InsertingNumbers_Array {

	public static void main(String[] args) {
		int size , loc , item;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size-");
		size=sc.nextInt();
		
		int a[]=new int[size+1];
		System.out.print("Enter array elements");
		for(int i=0; i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter array location");
		loc=sc.nextInt();
		System.out.print("Enter new items");
		item =sc.nextInt();
		
		for ( int i=size;i>loc;i--) {
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
     
    }
}
