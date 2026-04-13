import java.util.*;

public class LongestSubArrayWithgivenSumK {

    public int solution(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> presum = new HashMap<>();
        int sum = 0;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            // check for sum-k were come before or not .
            int rem = sum - k;
            if (presum.containsKey(rem)) {
                int len = i - presum.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            // if sum in not present in the hash
            if (!presum.containsKey(sum)) {
                presum.put(sum, i);
            }
        }
        return maxlen;

    }

    public static void main(String[] args) {
        LongestSubArrayWithgivenSumK LongestSubArrayWithgivenSumK = new LongestSubArrayWithgivenSumK();
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        System.out.println(LongestSubArrayWithgivenSumK.solution(nums, 14));
    }
}
