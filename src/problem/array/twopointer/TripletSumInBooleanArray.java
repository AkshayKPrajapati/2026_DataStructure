package problem.array.twopointer;

import java.util.HashSet;
public class TripletSumInBooleanArray {
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8} ;
		int target = 13;
		boolean x = hasTripletSum(arr,target);
		System.out.println(x);
	}
	
	//my code 
	public static boolean hasTripletSum(int arr[], int target) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					int sum=arr[i]+arr[j]+arr[k];
					
					if(sum==target) {
						return true;
					}
				}
			}
		}
		return false;
        
    }
	
	//optimization code
	public static boolean hasTripletSums(int arr[], int target) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int required = target - arr[i] - arr[j];

                if (set.contains(required)) {
                    return true;
                }

                set.add(arr[j]);
            }
        }

        return false;
    }
}
