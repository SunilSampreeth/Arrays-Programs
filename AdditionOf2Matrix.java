package arrays;

import java.util.Scanner;

public class AdditionOf2Matrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row of array");
		int row = sc.nextInt();
		System.out.println("enter the col of array");
		int col = sc.nextInt();
		int[][] m1 = new int[row][col];
		int[][] m2 = new int[row][col];

		System.out.println("Enter the 1st matrix");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the 2nd matrix");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				int res = m1[i][j] + m2[i][j];
				System.out.print(res + " ");
			}
			System.out.println();
		}
	}

}
