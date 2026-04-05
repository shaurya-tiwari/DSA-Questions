import java.util.Arrays;

public class MOVEZERO {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {

                int temp = nums[i]; // Step 1: Save the value of i
                nums[i] = nums[j]; // Step 2: Move the value of j into i
                nums[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {
        MOVEZERO m = new MOVEZERO();
        int[] arr = { 0, 1, 0, 3, 12 };
        m.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}


// method 2 

// public void moveZeroes(int[] nums) {
//     int insertPos = 0;

//     // Step 1: Only move non-zero elements to the front
//     for (int num : nums) {
//         if (num != 0) {
//             nums[insertPos] = num;
//             insertPos++;
//         }
//     }

//     // Step 2: Fill the remaining space with zeroes
//     while (insertPos < nums.length) {
//         nums[insertPos] = 0;
//         insertPos++;
//     }
// }
