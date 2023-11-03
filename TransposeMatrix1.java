package arrays;

import java.util.Scanner;

public class TransposeMatrix1 {
	public static void main(String[] args){
		   Scanner sc= new Scanner(System.in);
		    System.out.println("enter the number of rows");
		  int row=sc.nextInt();
		   System.out.println("enter the number of column");
		  int col=sc.nextInt();
		  int[][] arr= new int[row][col];
		  System.out.println("Enter the matrix");
		  for(int i=0; i<row; i++){
		    for(int j=0; j<col; j++){
		      arr[i][j]=sc.nextInt();
		    }
		  }
		   System.out.println("Transpose matrix is");
		  for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr.length; j++) {
						arr[j][i]=arr[j][i];
						System.out.print(arr[j][i]+" ");
					}
					System.out.println();
				}
		}

}
