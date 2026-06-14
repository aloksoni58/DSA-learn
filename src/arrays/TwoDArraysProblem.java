package arrays;

public class TwoDArraysProblem {

	// find the sum of each row of a 2D matrix
	public static void sumOfEachRow(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			System.out.println("Sum of row " + i + ": " + sum);
		}
	}

	// print a 2D matrix in spiral format
	public static void spiralPrint(int[][] mat) {
		int startRow = 0;
		int endRow = mat.length - 1;
		int startCol = 0;
		int endCol = mat[0].length - 1;

		System.out.print("Spriral representation: ");
		while (startRow <= endRow && startCol <= endCol) {

			// print top
			for (int i = startCol; i <= endCol; i++) {
				System.out.print(mat[startRow][i] + ", ");
			}

			// print right
			for (int i = startRow + 1; i <= endRow; i++) {
				System.out.print(mat[i][endCol] + ", ");
			}

			// print bottom
			for (int i = endCol - 1; i >= startCol; i--) {
				// using this condition because if this condition becomes true that means the
				// value for this iteration will be printed in first loop
				if (startRow == endRow) {
					break;
				}
				System.out.print(mat[endRow][i] + ", ");
			}

			// print left
			for (int i = endRow - 1; i >= startRow + 1; i--) {
				// using this condition because if this condition becomes true that means the
				// value for this iteration will be printed in second loop
				if (startCol == endCol) {
					break;
				}
				System.out.print(mat[i][startCol] + ", ");
			}

			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
		System.out.println();
	}

	// a number is given, target is to generate a matrix of n*n and fill with the
	// values from 1 to n*n
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int num = 1;
		int startRow = 0;
		int startCol = 0;
		int endRow = n - 1;
		int endCol = n - 1;
		while (startRow <= endRow && startCol <= endCol) {

			for (int i = startCol; i <= endCol; i++) {
				matrix[startRow][i] = num++;
			}

			for (int i = startRow + 1; i <= endRow; i++) {
				matrix[i][endCol] = num++;
			}

			for (int i = endCol - 1; i >= startCol; i--) {
				matrix[endRow][i] = num++;
			}

			for (int i = endRow - 1; i >= startRow + 1; i--) {
				matrix[i][startCol] = num++;
			}

			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
		return matrix;
	}

	// find the diagonal sum of a 2D matrix
	public static void diagonalSum(int[][] matrix) {
		int sum = 0;
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//				if (i == j) {
//					sum += matrix[i][j];
//				} else if (i + j == matrix.length - 1) {
//					sum += matrix[i][j];
//				}
//			}
//		}

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
			if (i != matrix.length - 1 - i)
				sum += matrix[i][matrix.length - 1 - i];
		}
		System.out.println("Sum of diagonal is: " + sum);

	}

	// Search in a 2D matrix
	public static void staircaseSearch(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int i = 0;
		int j = n - 1;

		// By taking top right corner
//		while (i < m && j >= 0) {
//			// if target meets then return true
//			if (target == matrix[i][j]) {
//				System.out.println("Target founded at : (" + i + ", " + j + ")");
//				return;
//			}
//			// if target < cellValue then go to left
//			else if (target < matrix[i][j]) {
//				j--;
//			}
//			// if target > cellValue then go to bottom
//			else if (target > matrix[i][j]) {
//				i++;
//			}
//		}
//		System.out.println("Target not found!!");

		// By taking bottom left corner
		i = m - 1;
		j = 0;
		while (i >= 0 && j < n) {
			// if target meets then return true
			if (target == matrix[i][j]) {
				System.out.println("Target founded at : (" + i + ", " + j + ")");
				return;
			}
			// if target < cellValue then go to top
			else if (target < matrix[i][j]) {
				i--;
			}
			// if target > cellValue then go to right
			else if (target > matrix[i][j]) {
				j++;
			}
		}
		System.out.println("Target not found!!");
	}

	// print the number of 7's that are present in 2D array
	public static void count_7s(int[][] mat) {
		int count = 0;
		for (int[] i : mat) {
			for (int j : i) {
				if (j == 7) {
					count++;
				}
			}
		}
		System.out.println("Number of 7s is: " + count);
	}

	// print the sum of second row of matrix
	public static void sumOfSecondRow(int[][] mat) {
		int sum = 0;
		for (int i = 0; i < mat[1].length; i++) {
			sum += mat[1][i];
		}
		System.out.println("Sum of second row is: " + sum);
	}

	// find transpose of a matrix
	public static void findTranspose(int[][] mat) {
		int[][] trans = new int[mat[0].length][mat.length];
		int r = 0;
		while (r < mat.length) {
			int c = 0;
			while (c < mat[0].length) {
				trans[c][r] = mat[r][c];
				c++;
			}
			r++;
		}
		System.out.println("Transpose of the matrix is: ");
		printMatrix(trans);
	}

	// print matrix
	public static void printMatrix(int[][] mat) {
		for (int[] i : mat) {
			System.out.print("[ ");
			for (int j : i) {
				System.out.print(j + ", ");
			}
			System.out.println("]");
		}
	}
}
