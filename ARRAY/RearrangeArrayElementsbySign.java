import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsbySign {
        public int[] rearrangeArray(int[] nums) {
                ArrayList<Integer> positivenumbers = new ArrayList<>();
                ArrayList<Integer> negetivenumbers = new ArrayList<>();
                int[] newarr = new int[nums.length];
                for (int i = 0; i < nums.length; i++) {
                        if (nums[i]>=0) {
                                positivenumbers.add(nums[i]);
                        }
                        else {
                                negetivenumbers.add(nums[i]);
                        }
                }
                for (int i = 0; i < positivenumbers.size(); i++) {
                        newarr[2*i]=positivenumbers.get(i);
                        newarr[2*i+1]=negetivenumbers.get(i);
                                        
                }
                return newarr;
        }
        public static void main(String[] args) {
                RearrangeArrayElementsbySign RearrangeArrayElementsbySign = new RearrangeArrayElementsbySign();
                int[] arr = { 3, 1, -2, -5, 2, -4 };
                int[] result = RearrangeArrayElementsbySign.rearrangeArray(arr);
                System.out.println(Arrays.toString(result));
        }
}
