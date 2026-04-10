import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(i, count.getOrDefault(count, 1));
        }

        for (int i : count.keySet()) {
            
        }
        return;

    }

    public static void main(String[] args) {
        SingleNumber SingleNumber = new SingleNumber();

        int[] arr = { 2, 2, 5, 5, 7, 8, 8, 9, 9 };
        System.out.println(SingleNumber.singleNumber(arr));
    }
}
