package org.array.Examples;
import java.util.*;
public class Multidimensional_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[2][3];
		System.out.println("Enter values");
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display Array");
		for(int i=0; i<a.length;i++) {
			for(int j=0 ; j<a[i].length;j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}
