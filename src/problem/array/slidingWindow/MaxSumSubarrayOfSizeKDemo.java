package problem.array.slidingWindow;

public class MaxSumSubarrayOfSizeKDemo {
	public static int  maxSubarraySum(int arr[],int k){
		int maxSum=0;
		int leftIndex=0;
		int rightIndex=arr.length-1;
		
		for(int i=0;i<=arr.length-k;) {
			int currentSum = 0;
			for(int j=i;j<=k;j++) {
				currentSum=arr[i]+arr[j];
			}
			
			if(currentSum<maxSum)
			{
				return maxSum;
			}
			else {
				return currentSum;
			}
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
