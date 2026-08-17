
public class CountOccurrencesinaSortedArray {
    
        public int countOccurrences(int[] arr, int target) {
        // Your code goes here
        int count = 1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        
    }
}
