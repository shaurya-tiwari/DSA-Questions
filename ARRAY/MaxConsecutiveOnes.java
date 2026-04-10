public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount = 0;
        int courrentstreak = 0;

        // enhanced for
        for (int i : nums) {
            if (i == 1) {
                currentcount++;
                courrentstreak = Math.max(courrentstreak, currentcount);
            } else
                currentcount = 0;
        }
        return courrentstreak;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes mx = new MaxConsecutiveOnes();

        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int[] nums2 = { 1, 0, 1, 1, 0, 1 };
        int[] nums3 = { 1,1,1,1,1,1,1,1,1,1 };
        System.out.println(mx.findMaxConsecutiveOnes(nums3));
    }
}
