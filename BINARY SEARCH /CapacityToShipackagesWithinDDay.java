public class CapacityToShipackagesWithinDDay {
    
public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        
        // Step 1: Range Set Karna (Setup)
        for (int weight : weights) {
            left = Math.max(left, weight); // left = sabse bhari package
            right += weight;               // right = saare packages ka total weight
        }
        
        int ans = -1;
        
        // Step 2: Capacity Guess Karna
        while (left <= right) {
            int mid = left + (right - left) / 2; // mid = Ship ki capacity
            
            // Step 3 & 4: Worker se check karwana aur Decision lena
            if (isPossible(weights, days, mid)) {
                ans = mid;           // Yeh capacity valid hai, isko save kar lo
                right = mid - 1;     // Par kya isse chhoti capacity kaam karegi? (Check Left)
            } else {
                left = mid + 1;      // Yeh capacity fail ho gayi, badi ship chahiye (Check Right)
            }
        }
        
        return ans;
    }
    
    // 👷‍♂️ THE WORKER (Helper Function)
    private boolean isPossible(int[] weights, int days, int capacity) {
        int daysNeeded = 1;  // Pehla din shuru!
        int currentLoad = 0; // Ship abhi khali hai
        
        for (int weight : weights) {
            // Kya naya package daalne par capacity cross ho jayegi?
            if (currentLoad + weight > capacity) {
                daysNeeded++;          // Naya din shuru karo (Nayi ship bulao)
                currentLoad = weight;  // Is package ko nayi ship mein daalo
            } else {
                currentLoad += weight; // Jagah bachi hai, isko bhi current ship mein daal do
            }
        }
        
        // Kya humne total days deadline (D) ke andar poore kiye?
        return daysNeeded <= days; 
    }
    public static void main(String[] args) {
        
    }
}
