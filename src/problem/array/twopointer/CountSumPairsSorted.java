package problem.array.twopointer;

public class CountSumPairsSorted {
	static int countPairs(int arr[], int target) {
		int count=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				int sum=arr[i]+arr[j];
				if(sum==target) {
					count++;
				}
			}
		}
		return count; 
    }
	public static void main(String[] args) {
		int arr[] = {-1, 1, 5, 5, 7};
		int target = 6;
		int x = countPairs(arr,target);
		System.out.println("Target Count is : "+x);
	}
}
