package problem.array.slidingWindow;

public class MaxSumSubarrayOfSizeKDemo {
	public static int maxSubarraySum(int arr[], int k) {

        if (arr.length < k) {
            return -1;
        }

        int windowSum = 0;

        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Sliding window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
	public static void main(String [] a) {
	int arr[] = {100, 200, 300, 400};
	int k = 2;
	int result = maxSubarraySum(arr, k);
	System.out.println("Result : "+result);
	}
}
