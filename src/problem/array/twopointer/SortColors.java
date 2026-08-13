package problem.array.twopointer;

public class SortColors {
	
	//my code  approach - nested loops 
	// time complexity o(n2)
	// space complexity o(1)
	public static void sort012(int[] arr) {
        
		int length=arr.length;
        for(int i=0;i<length;i++) {
        	for(int j=i+1;j<length;j++) {
        		
        		if(arr[i]>arr[j]) {
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        
       for (int i : arr) {
		System.out.println(i);
       }
    }
	
	//optimization code  (leetcode Question No : 75)
	public void sortColors(int[] nums) {
        
		int length=nums.length;
        for(int i=0;i<length;i++) {
        	for(int j=i+1;j<length;j++) {
        
        		if(nums[i]>nums[j]) {
        			int temp=nums[i];
        			nums[i]=nums[j];
        			nums[j]=temp;
        		}
        	}
        }
        
       for (int i : nums) {
		System.out.println(i);
       }
    }
	
	
	
	// optimization code for geekforgeeks approach Dutch National Flag
	// time complexity o(n2)
	// space complexity o(1)
	public static void sortColor(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
	
	
	public static void main(String[] args) {
		 int arr[] = {0, 1, 2, 0, 1, 2};
		 sort012(arr);
	}
}
