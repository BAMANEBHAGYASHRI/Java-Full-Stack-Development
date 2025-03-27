package org.array.Examples;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]= new int[6];
		System.out.print("Enter your values");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.print("SUm of Array"+ sum);
		

	}

}
