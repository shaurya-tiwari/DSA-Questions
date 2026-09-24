public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0;
        int k = 0;
        for (int j =  1; j < nums.length; j++) {
            if (nums[j]!=nums[i]) {
                i++;
                nums[i]=nums[j];
                k+=1;
            }
        }
        
        return k+1;
    }

    // MAIN METHOD - Run karne ke liye
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 1, 2};
        System.out.println("--- Test Case 1 ---");
        int k1 = removeDuplicates(nums1);
        System.out.print("Expected Output: 2, Unique Array: [1, 2]\n");
        System.out.print("Your Output: " + k1 + ", Unique Array: ");
        printArray(nums1, k1);
        System.out.println();

        // Test Case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("--- Test Case 2 ---");
        int k2 = removeDuplicates(nums2);
        System.out.print("Expected Output: 5, Unique Array: [0, 1, 2, 3, 4]\n");
        System.out.print("Your Output: " + k2 + ", Unique Array: ");
        printArray(nums2, k2);
    }

    // Helper method: Array ko 'k' elements tak print karne ke liye
    public static void printArray(int[] arr, int k) {
        if (k <= 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}