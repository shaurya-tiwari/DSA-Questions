import java.util.Arrays;

public class rotateArrayByK {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n <= 1) {
            return;
        }
        k = k % n;
        if (k == 0)
            return;

        revers(0, nums, n - 1); // full reverse
        revers(0, nums, k - 1);// reverse till k
        revers(k, nums, n - 1); // reverse rest after k

    }

    // swap logic
    public void revers(int left, int[] arr, int right) {
        // check for small first element
        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        rotateArrayByK rotateArrayByK = new rotateArrayByK();
        int[] arr = { -1 };
        rotateArrayByK.rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
