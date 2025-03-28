package org.array.Examples;
import java.util.*;
public class ReplaceNumbers_Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Values");
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value for fetchng");
		int index=sc.nextInt();
		int value=sc.nextInt();
		for(int i=0; i<arr.length;i++) {
			if(i == index) {
				arr[i]=value;
			}
		}
		System.out.println("Display Array");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
