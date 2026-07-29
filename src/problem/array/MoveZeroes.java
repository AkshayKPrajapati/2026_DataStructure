package problem.array;

public class MoveZeroes {
	public static void main(String [] args) {
		int[] num = {12,0,34,32,45,0,35,0,40,89};
		moveZeroes(num);
		
	}
	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		int i=0;
		
		for(int j=0;j<n;j++) {
			if(nums[j]!=0) {
				nums[i]=nums[j];
				i++;
			}
		}
		while(i<n) {
			nums[i]=0;
			i++;
		}
		for(int num: nums) {
			System.out.print(num+" ");
		}
	}
}
