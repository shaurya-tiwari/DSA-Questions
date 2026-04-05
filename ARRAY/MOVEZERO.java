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
