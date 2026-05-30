package Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {-2,-4,-6,-8,-10};
        arrayProblems.printPairs(numbers);
        arrayProblems.subArray(numbers);
        arrayProblems.subarraySum(numbers);
        arrayProblems.minMaxSubarraySum(numbers);
        arrayProblems.maxSubarraySumUsingPrefixSum(numbers);
        arrayProblems.kadanes(numbers);
    	
    	int[] arr = {4,2,0,6,3,2,5};
    	TrappedRainWater.trappedRainWater(arr);
    }
}