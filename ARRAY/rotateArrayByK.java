import java.util.Arrays;

public class rotateArrayByK {

    public void rotate(int[] nums, int k) {
        int temp = nums[0];
        int n = nums.length;
        for (int i = 1; i <n; i++) {
            nums[i - 1] = nums[i];

        }
        nums[n-1] = temp;

    }

    public static void main(String[] args) {
        rotateArrayByK rotateArrayByK = new rotateArrayByK();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArrayByK.rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
