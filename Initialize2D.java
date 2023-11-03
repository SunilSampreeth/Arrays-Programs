package arrays;

public class Initialize2D {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][2];
		
		arr[0][0]=10; //first row and first column
		arr[0][1]=20; //first row and second column
		arr[1][0]=30; // second row first column
		arr[1][1]=40; // second row second column
		
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
