package arrays;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int row=sc.nextInt();
		System.out.println("enter the col size");
		int col=sc.nextInt();
		
		int[][] arr = new int[row][col];
		System.out.println("enter the matrix");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
