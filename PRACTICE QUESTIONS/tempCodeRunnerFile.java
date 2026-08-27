public class palindromeNumber {
    
    public boolean isPalindrome(int x) {
        // Step 1: Handle edge cases
        // Negative numbers and numbers ending in 0 (except 0 itself) are never palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Step 2: Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Step 3: Compare both halves
        // For even-length numbers, x == reversedHalf (e.g., 1221 -> x = 12, reversedHalf = 12)
        // For odd-length numbers, x == reversedHalf / 10 (e.g., 12321 -> x = 12, reversedHalf = 123)
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        palindromeNumber obj = new palindromeNumber();
        
        // Test Case 1: Standard odd-length palindrome
        System.out.println("Test 121: " + obj.isPalindrome(121));   // Expected: true
        
        // Test Case 2: Negative number
        System.out.println("Test -121: " + obj.isPalindrome(-121)); // Expected: false
        
        // Test Case 3: Ends in zero
        System.out.println("Test 10: " + obj.isPalindrome(10));     // Expected: false
        
        // Test Case 4: Standard even-length palindrome
        System.out.println("Test 1221: " + obj.isPalindrome(1221)); // Expected: true
    }
}