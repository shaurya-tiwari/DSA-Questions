public class SingleNumber {

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    return nums[j];
                }
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        SingleNumber SingleNumber = new SingleNumber();

        int[] arr = {2,2,5,5,7,8,8,9,9 };
       System.out.println( SingleNumber.singleNumber(arr));
    }
}
