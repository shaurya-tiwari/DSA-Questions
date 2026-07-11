import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive {
       class Solution {
    public int longestConsecutive(int[] nums) {
        // Step 1: Ek khali set banaiye
        HashSet<Integer> set = new HashSet<>();
        
        // Saare numbers ko set mein daal dijiye
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0; // Ab tak ka sabse bada sequence
        
        // Step 2: Set ke andar har number ko check kariye
        for (int num : set) {
            
            // TRICK: Kya yeh sequence ki shuruat (starting point) hai?
            // Agar (num - 1) set mein NAHI hai, tabhi hum isko starting point manenge
            if (!set.contains(num - 1)) {
                
                int currentNum = num;
                int currentStreak = 1;
                
                // Jab tak sequence ka agla number (currentNum + 1) set mein milta rahe...
                while (set.contains(currentNum + 1)) {
                    currentNum++;     // Number ko ek badhao
                    currentStreak++;  // Streak/Count ko ek badhao
                }
                
                // Max tracker ko update kar do
                longest = Math.max(longest, currentStreak);
            }
        }
        
        return longest;
    }}
}
