package arrays;

import java.util.Scanner;

public class SmallestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the "+arr.length+" elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];			
			}
		}
		System.out.println("largest element is "+min);
		
		
	}

}


//Program to reverse an array:
//Program to find the second largest element in an array:
	 