public class streak28 {
    
    public boolean checkDivisibility(int n) {
        // Fix: Use modulo (%) to get the last digit
        int digi1 = n / 10; // Gets the tens digit
        int digi2 = n % 10; // Gets the units digit

        int sum = digi1 + digi2;
        int prod = digi1 * digi2;

        // Check if divisible by both sum and prod.
        // We must ensure prod is not 0 to avoid a divide-by-zero error.
        // (Sum will only be 0 if n is 0, which is safe if we assume positive inputs).
        if (prod != 0 && n % sum == 0 && n % prod == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        streak28 obj = new streak28();
        
        // Test Case 1: 12 
        // sum = 3, prod = 2. (12 % 3 == 0) and (12 % 2 == 0) -> Returns true
        System.out.println("Result for 12: " + obj.checkDivisibility(12)); 
        
        // Test Case 2: 24 
        // sum = 6, prod = 8. (24 % 6 == 0) and (24 % 8 == 0) -> Returns true
        System.out.println("Result for 24: " + obj.checkDivisibility(24)); 
        
        // Test Case 3: 20 (Testing divide-by-zero prevention)
        // sum = 2, prod = 0. -> Returns false safely
        System.out.println("Result for 20: " + obj.checkDivisibility(20)); 
        
        // Test Case 4: 23
        // sum = 5, prod = 6. -> Returns false
        System.out.println("Result for 23: " + obj.checkDivisibility(23)); 
    }
}