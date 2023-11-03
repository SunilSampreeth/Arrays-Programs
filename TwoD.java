package arrays;

public class TwoD {
	public static void main(String[] args) {
		
		int[][] arr = {{10,20,30}, {40,50,60},{45,55,66}};
		
		// accessing all element
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
