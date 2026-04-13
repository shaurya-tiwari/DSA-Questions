import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> pair = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (pair.containsKey(target - nums[i])) { /// check for present available or not
                return new int[] { pair.get(target - nums[i]), i };// if presrtn then get the pair
            } else
                pair.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum TwoSum = new TwoSum();
        int[] nums = { 11, 15, 7, 2 };
        int print[] = TwoSum.twoSum(nums, 9);
        System.out.println(Arrays.toString(print));

    }
}
