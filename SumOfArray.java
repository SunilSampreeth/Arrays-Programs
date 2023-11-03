package arrays;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int a:arr) {
			sum=sum+a;
			}
		System.out.println("sum is "+sum);
		System.out.println("Average is "+sum/size);
	}

}
