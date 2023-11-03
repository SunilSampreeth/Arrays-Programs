package arrays;

import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt(); //10,20,10,30,
		}
		System.out.println("duplicate elements");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}
}
