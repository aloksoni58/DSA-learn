package arrays;

public class TwoDArraysProblem {

	public static void sumOfEachRow(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			System.out.println("Sum of row " + i + ": " + sum);
		}
	}

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
	
	public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
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
	
	public static void printMatrix(int[][] mat) {
		for (int[] i : mat) {
			System.out.print("[ ");
			for(int j : i) {
				System.out.print(j + ", ");
			}
			System.out.println("]");
		}
	}
}
