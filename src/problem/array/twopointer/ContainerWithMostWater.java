package problem.array.twopointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 3};

        int x = maxWater(arr);
        System.out.println(x);
    }

    public static int maxWater(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right) {

            // Height is the smaller of the two lines
            int h = Math.min(arr[left], arr[right]);

            // Width is the distance between the two pointers
            int width = right - left;

            // Calculate area
            int area = h * width;

            // Update maximum area
            maxArea = Math.max(maxArea, area);

            // Move the pointer with smaller height
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
