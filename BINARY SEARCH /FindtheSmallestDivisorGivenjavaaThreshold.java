import java.lang.reflect.Array;
import java.util.Arrays;

public class FindtheSmallestDivisorGivenjavaaThreshold {

    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;

        int right = Arrays.stream(nums).max().getAsInt();
        int ans = right;
        while (left <= right) {
            int sum = 0;

            int mid = left + (right - left) / 2;

            for (int i : nums) {

                sum += (i + mid - 1) / mid; // fr ciel value
            }

            if (sum <= threshold) {
                ans = mid;
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        FindtheSmallestDivisorGivenjavaaThreshold solver = new FindtheSmallestDivisorGivenjavaaThreshold();

        // Test Case 1
        int[] nums1 = { 1, 2, 5, 9 };
        int threshold1 = 6;
        int ans1 = solver.smallestDivisor(nums1, threshold1);
        System.out.println("Test 1 Result: " + ans1 + " | Expected: 5");

        // Test Case 2
        int[] nums2 = { 44, 22, 33, 11, 1 };
        int threshold2 = 5;
        int ans2 = solver.smallestDivisor(nums2, threshold2);
        System.out.println("Test 2 Result: " + ans2 + " | Expected: 44");

        // Test Case 3
        int[] nums3 = { 2, 3, 5, 7, 11 };
        int threshold3 = 11;
        int ans3 = solver.smallestDivisor(nums3, threshold3);
        System.out.println("Test 3 Result: " + ans3 + " | Expected: 3");
    }
}