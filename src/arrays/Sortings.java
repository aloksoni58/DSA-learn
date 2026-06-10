package arrays;

public class Sortings {

	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int swap = 0;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(swap == 0) {
				break;
			}
		}
		
		System.out.println("Array after bubble sort");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
	
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int minPos = i;
			//finding the minimum element in comparison to element at minPos
			for(int j = i + 1; j < arr.length; j++) {
				//if the smallest element found then override the value of minPos by the index of minimum element
				if(arr[minPos] > arr[j]) {
					minPos = j;
				}
			}
			//swap
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
		System.out.println("\nArray after selection sort");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
	
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println("\nArray after insertion sort");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		
	}
	
	public static void countingSort(int[] arr) {
		int max = arr[0];
		//find max element from the array for count length
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		//create count array and initialize it with frequency of elements
		int[] count = new int[max+1];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		
		//store in the the array in sorted order
		int j = 0;
		for(int i = 0; i < count.length-1; i++) {
			while(count[i] > 0) {
				arr[j] = i;
				count[i]--;
				j++;
			}
		}
		System.out.println("\nArray after counting sort");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
	
}
