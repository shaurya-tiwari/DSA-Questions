import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        //Sort

    }

    public static void main(String[] args) {
        SortColors SortColors = new SortColors();
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        // 1. Pehle function call karo (ye original 'nums' ko sort kar dega)
        SortColors.sortColors(nums);

        // 2. Ab modified array ko print karo
        System.out.println(java.util.Arrays.toString(nums));
    }
}
