public class SymmetricMatrix {
	/* Initialize a 2D array of 3*3 matrix. E.g.-
	 *  {1, 2, 3}
		{4, 5, 6}
		{7, 8, 9}
	 * Check if the matrix is symmetric or not.
	 */
	public static void main(String[] args) {
		final int ROW = 3, COL = 3;
		int[][] matrix = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
			};
		int[][] transpose =  new int[COL][ROW];
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				transpose[j][i] = matrix[i][j];
			}
			
		}
		
		boolean isSymmetric = true;
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				if(transpose[i][j] != matrix[i][j]) {
					isSymmetric = false;
					break;
				}
				else {
					isSymmetric = true;
				}
			}
		}
		
		if(isSymmetric) {
			System.out.println("The matrix is Symmetric");
		}
		else {
			System.out.println("The matrix is NOT Symmetric");
		}

	}

}
