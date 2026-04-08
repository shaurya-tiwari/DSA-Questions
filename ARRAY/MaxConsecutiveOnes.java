import java.util.HashSet;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int current_count = 0;
        HashSet<Integer> maxcount = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                current_count++;
            }
        }
        

        return 0;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes mx = new MaxConsecutiveOnes();

        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(mx.findMaxConsecutiveOnes(nums));
    }
}