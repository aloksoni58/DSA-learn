package Arrays;

public class arrayProblems {

    public static void printPairs(int[] numbers) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + " ," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + tp);
    }

    public static void subArray(int[] numbers) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total subarryas: " + ts);
    }

    public static void subarraySum(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                System.out.println(" : " + sum);
            }
        }
    }

    public static void minMaxSubarraySum(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                if(currSum < min) {
                    min = currSum;
                }
                if(currSum > max) {
                    max = currSum ;
                }
            }
        }
        System.out.println("Minimum : " + min + "\nMaximum : " + max);
    }

    public static void maxSubarraySumUsingPrefixSum(int[] numbers) {

        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];
        prefix[0] = numbers[0];
        //finding prefix sum
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        //finding max using formula (max = prefix[j] - prefix[i-1])
        for (int i = 0; i < numbers.length; i++) {
            int currSum = 0;
            for (int j = i; j < numbers.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum subarray sum : " + maxSum);
    }
}
