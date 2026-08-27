public class FindMinimuminRotatedSortedArray {
    
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Perform Binary Search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // the minimum is strictly to the right.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Otherwise, the minimum is at mid or to the left.
            else {
                right = mid;
            }
        }

        // When left == right, we have found the minimum element.
        return nums[left];
    }

    public static void main(String[] args) {
        FindMinimuminRotatedSortedArray obj = new FindMinimuminRotatedSortedArray();
        
        // Test Case 1: Rotated at the middle
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Test 1 Result: " + obj.findMin(nums1)); // Expected Output: 1
        
        // Test Case 2: Rotated further to the right
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Test 2 Result: " + obj.findMin(nums2)); // Expected Output: 0
        
        // Test Case 3: Fully sorted array (rotated 0 times)
        int[] nums3 = {11, 13, 15, 17};
        System.out.println("Test 3 Result: " + obj.findMin(nums3)); // Expected Output: 11
    }
}