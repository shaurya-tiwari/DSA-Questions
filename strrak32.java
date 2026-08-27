class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        
        // Step 1: Count frequencies of characters in 's'
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Find the maximum prefix of 'target' we can form using 's'
        int[] available = count.clone();
        int matchLen = 0;
        for (int i = 0; i < n; i++) {
            if (available[target.charAt(i) - 'a'] > 0) {
                available[target.charAt(i) - 'a']--;
                matchLen++;
            } else {
                break;
            }
        }

        // The latest index we could possibly diverge at. 
        int startIdx = Math.min(matchLen, n - 1);

        // Rebuild the 'available' character pool to represent the state 
        // exactly BEFORE placing a character at startIdx
        available = count.clone();
        for (int i = 0; i < startIdx; i++) {
            available[target.charAt(i) - 'a']--;
        }

        // Step 3: Backtrack to find the optimal divergence point
        for (int i = startIdx; i >= 0; i--) {
            char tChar = target.charAt(i);

            // Try to find the smallest available character strictly greater than target[i]
            for (char c = (char) (tChar + 1); c <= 'z'; c++) {
                if (available[c - 'a'] > 0) {
                    
                    // We found our divergence point! Build the result string.
                    StringBuilder sb = new StringBuilder();
                    sb.append(target.substring(0, i)); // 1. The matching prefix
                    sb.append(c);                      // 2. The greater character
                    available[c - 'a']--;

                    // 3. Append all remaining characters in sorted (ascending) order
                    for (char x = 'a'; x <= 'z'; x++) {
                        while (available[x - 'a'] > 0) {
                            sb.append(x);
                            available[x - 'a']--;
                        }
                    }
                    
                    return sb.toString();
                }
            }

            // If no valid character can be placed at 'i', we backtrack to 'i-1'.
            if (i > 0) {
                available[target.charAt(i - 1) - 'a']++;
            }
        }

        // Step 4: No valid permutation exists
        return "";
    }
}