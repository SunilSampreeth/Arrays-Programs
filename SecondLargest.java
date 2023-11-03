package arrays;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt(); //30 , 20, 40,10
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]); // print sorting array
			
		}
		System.out.println("second lorgest element "+arr[arr.length-2]);
	}

}
