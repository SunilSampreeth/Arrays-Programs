package arrays;

import java.util.Scanner;

public class LagestElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt(); //4
	int[] arr = new int[size];
	System.out.println("enter the array elements");
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt(); //10,50,30,20
	}
	int max=arr[0];
	for(int i=1; i<arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];			
		}
	}
	System.out.println("largest element is "+max);
	
}

}
