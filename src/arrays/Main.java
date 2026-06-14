package arrays;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { -2, -4, -6, -8, -10 };
		arrayProblems.printPairs(numbers);
		arrayProblems.subArray(numbers);
		arrayProblems.subarraySum(numbers);
		arrayProblems.minMaxSubarraySum(numbers);
		arrayProblems.maxSubarraySumUsingPrefixSum(numbers);
		arrayProblems.kadanes(numbers);

		int[] arr = { 4, 2, 0, 6, 3, 2, 5 };
		TrappedRainWater.trappedRainWater(arr);

		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		int[] prices = {7,6,5,4,3,1};
		BuyAndSellStocks.buyAndSellStocks(prices);

		int[] arr2 = { 5, 4, 3, 1, 2 };
		Sortings.bubbleSort(arr2);
		Sortings.selectionSort(arr2);
		Sortings.insertionSort(arr2);
		int[] arr3 = { 1, 4, 1, 3, 2, 4, 3, 7 };
		Sortings.countingSort(arr3);

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		TwoDArraysProblem.sumOfEachRow(matrix);

		TwoDArraysProblem.spiralPrint(matrix);
		int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		TwoDArraysProblem.spiralPrint(matrix2);

		int[][] matrix3 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		TwoDArraysProblem.spiralPrint(matrix3);

		int[][] matrix4 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		TwoDArraysProblem.spiralPrint(matrix4);

		int[][] matrix5 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		TwoDArraysProblem.spiralPrint(matrix5);

		TwoDArraysProblem.printMatrix(TwoDArraysProblem.generateMatrix(3));
		TwoDArraysProblem.printMatrix(TwoDArraysProblem.generateMatrix(4));
		TwoDArraysProblem.printMatrix(TwoDArraysProblem.generateMatrix(5));

		TwoDArraysProblem.diagonalSum(matrix);
		TwoDArraysProblem.diagonalSum(matrix2);

		TwoDArraysProblem.staircaseSearch(matrix5, 11);
		TwoDArraysProblem.staircaseSearch(matrix4, 19);
		TwoDArraysProblem.staircaseSearch(matrix4, 100);

		int[][] matrix6 = { { 4, 7, 8 }, { 8, 8, 7 } };
		TwoDArraysProblem.count_7s(matrix5);
		TwoDArraysProblem.count_7s(matrix6);
		
		TwoDArraysProblem.sumOfSecondRow(matrix6);
		TwoDArraysProblem.sumOfSecondRow(matrix4);
		
		TwoDArraysProblem.findTranspose(matrix6);
	}
}