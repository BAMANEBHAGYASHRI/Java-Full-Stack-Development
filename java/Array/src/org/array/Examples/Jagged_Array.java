package org.array.Examples;
import java.util.*;
public class Jagged_Array {

	public static void main(String[] args) {
		int a[][]=new int[4][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[1];
		a[3]=new int[4];
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter values");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display Jagged Array");
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		

	}

}
