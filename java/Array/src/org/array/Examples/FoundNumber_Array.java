package org.array.Examples;
import java.util.*;
public class FoundNumber_Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Values");
		int arr[] = new int[5];
		for(int i=1; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter your value for search");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Data Found");
		}
		else {
			System.out.println(" not Data Found");
		}

	}

}
