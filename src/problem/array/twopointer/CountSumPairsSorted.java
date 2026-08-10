package problem.array.twopointer;

public class CountSumPairsSorted {
	static int countPairs(int arr[], int target) {
		int i=0;
		int j=i+1;
		while(i<=j) {
			target=i+j;
			i++;
		}
		return target;
        //  Code Here
    }
	public static void main(String[] args) {
		int arr[] = {-1, 1, 5, 5, 7};
		int target = 6;
		int x = countPairs(arr,target);
		System.out.println("Target Count is : "+x);
	}
}
