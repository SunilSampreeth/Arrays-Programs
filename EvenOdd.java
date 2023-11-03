package arrays;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");

		int size = sc.nextInt();
		int[] arr = new int[size]; // create an array object
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.println("even number is " + a);
			}
		}	
		for (int a : arr) {
			if (a % 2 != 0)
				System.out.println("odd number is " + a);
		}

	}

}
