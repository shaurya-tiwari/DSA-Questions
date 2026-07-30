package ARRAY;

import java.util.Arrays;

public class MaximumProductSubarray {
        public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProd = Integer.MIN_VALUE;
        int leftProduct = 1;  
        int rightProduct = 1; 
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (leftProduct == 0) leftProduct = 1;
            if (rightProduct == 0) rightProduct = 1;

            leftProduct = leftProduct * nums[i];            
            rightProduct = rightProduct * nums[n - - i];    

            maxProd = Math.max(maxProd, Math.max(leftProduct, rightProduct));
        }

        return maxProd;
    }


    public static void main(String[] args) {
        MaximumProductSubarray MaximumProductSubarray = new MaximumProductSubarray();
        int[] arr = {2,3,-2,4};
        MaximumProductSubarray.maxProduct(arr);
        System.out.println(MaximumProductSubarray.maxProduct(arr));
    }
}
