public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;


            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left = left + 1;
                right = right - 1;
                continue; // Yahan se naya mid calculate karne jao
            }

            if (nums[left] <= nums[mid]) { // mid big from rught
                if (target >= nums[left] && target < nums[mid]) { // if target big thrn left and small then mid
                    right = mid - 1; // pull right more back so that ary get reduce
                } else {
                    left = mid + 1;
                }

            } else { // mid bug from right
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // push left to right siode sp hat the half back array will cut
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
