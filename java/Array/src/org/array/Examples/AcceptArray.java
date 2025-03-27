package org.array.Examples;
import java.util.*;
public class AcceptArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter your 5 values");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+ "\t");
			
		}
		

	}

}
