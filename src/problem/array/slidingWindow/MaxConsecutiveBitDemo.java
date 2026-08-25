package problem.array.slidingWindow;

public class MaxConsecutiveBitDemo {
    public static int maxConsecutiveBits(int[] arr) {
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
    public static void main(String[] args) {
    	int arr[] = {0, 1, 0, 1, 1, 1, 1};
    	int x=maxConsecutiveBits(arr);
    	System.out.println(x);
	}
    
    
        public int findMaxConsecutiveOnes(int[] nums) {

            int currentCount = 0;
            int maxCount = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 1) {
                    currentCount++;
                    maxCount = Math.max(maxCount, currentCount);
                } else {
                    currentCount = 0;
                }
            }

            return maxCount;
        }
    
}