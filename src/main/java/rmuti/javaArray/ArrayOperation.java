package rmuti.javaArray;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperation {

	private int arr[] = new int[10];
	private int arr2[] = new int[10];

	// Constructor Save data to arrays
	public ArrayOperation() {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
			// System.out.print(arr[i] + " ");
		}
		// System.out.println();
	}

	// Method SumArrays
	public int SumArrays() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Method find MaxArrays
	public int maxArrays() {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	// Method copyArray
	public int[] copyArray(int star, int end) {
		int num[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++) {
			if (num.length >= star && num.length <= end) {
				arr2[i] = num[i];
			}
		}
		return arr2;
	}
	// public int[] getCopyArray(){
	// return arr2;
	// }
}
