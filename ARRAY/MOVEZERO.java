import java.util.Arrays;

public class MOVEZERO {

    public void moveZeroes(int[] nums) {
        int left = 0 ;

        for (int right = 0; right < nums.length; right++) {
            

            if (nums[right]!=0) {
                nums[left]=nums[right];
                left++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (left<nums.length) {
                nums[left]=0;

                left++;
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

