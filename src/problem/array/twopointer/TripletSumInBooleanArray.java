package problem.array.twopointer;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;

public class TripletSumInBooleanArray {
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8} ;
		int target = 13;
		boolean x = hasTripletSum(arr,target);
		System.out.println(x);
	}
	public static boolean hasTripletSum(int arr[], int target) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+i;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					int sum=arr[i]+arr[j]+arr[k];
					
					if(sum==target) {
						return true;
					}
				}
			}
		}
		return false;
        // code Here
        
    }
}
