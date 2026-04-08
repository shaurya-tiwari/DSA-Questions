public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount = 0;
        int courrentstreak = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                currentcount++;

            } else
                currentcount = 0;
            if (courrentstreak < currentcount) {
                courrentstreak = currentcount;
            }
        }

        return courrentstreak;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes mx = new MaxConsecutiveOnes();

        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int[] nums2 = { 1, 0, 1, 1, 0, 1 };
        System.out.println(mx.findMaxConsecutiveOnes(nums));
    }
}
