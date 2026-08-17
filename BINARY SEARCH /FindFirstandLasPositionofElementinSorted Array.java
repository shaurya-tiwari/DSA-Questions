package BINARY

import java.util.Arrays;

public class FindFirstandLasPositionofElementinSorted Array
{

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[nums.length];
        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;

                if (mid == target) {
                    ans[0] = mid;
                    right = mid - 1;
                } else if (nums[mid]<target) {
                    left = mid + 1;
                } 
                else{
                    right = mid - 1;
                }
            
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
