import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Gatherer.Integrator;

public class fourSumm {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Agar array mein 4 numbers se kam hain, toh possible hi nahi hai
        if (nums == null || nums.length < 4) {
            return result;
        }

        // Sabse zaroori step: Array ko sort karo (Taki duplicates skip kar sakein)
        Arrays.sort(nums);
        int n = nums.length;

        // Pehla number (i) fix kar rahe hain
        for (int i = 0; i < n - 3; i++) {
            // Duplicate 'i' ko skip karo
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Doosra number (j) fix kar rahe hain
            for (int j = i + 1; j < n - 2; j++) {
                // Duplicate 'j' ko skip karo
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                // Teesra (left) aur Chautha (right) number pointers se dhundhenge
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    // IMPORTANT: long use kiya hai taaki bade numbers add karne par overflow na ho
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        // Mil gaya! Ek naya 4-size ka set result mein add kar do
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Dono pointers ko aage/peeche badhao
                        left++;
                        right--;
                        
                        // Duplicate left ko skip karo
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        // Duplicate right ko skip karo
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } 
                    else if (sum < target) {
                        // Sum chota hai, toh bada number chahiye (left ko aage badhao)
                        left++;
                    } 
                    else {
                        // Sum bada hai, toh chota number chahiye (right ko peeche karo)
                        right--;
                    }
                }
            }
        }
        
        return result;
    }

    // forr lopp , list . add in. if not in small list , then add in samll list ,
    // then add hat smal iost in big list

    public static void main(String[] args) {
        fourSumm fourSumm = new fourSumm();
        int[] arr = { 2, 2, 2, 2, 2 };
        fourSumm.fourSum(arr, 8);

        System.out.println(fourSumm.fourSum(arr, 8));
    }
}