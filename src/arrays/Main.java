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
		
		int[] arr2 = {5,4,3,1,2};
		Sortings.bubbleSort(arr2);
		Sortings.selectionSort(arr2);
		Sortings.insertionSort(arr2);
		int[] arr3 = {1,4,1,3,2,4,3,7};
		Sortings.countingSort(arr3);
	}
}