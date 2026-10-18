public class KthMissingPositiveNumber {
    
     public int findKthPositive(int[] arr, int k) {
        
        int left = 0;
        int right = arr.length-1;

        while (left<=right) {
            
            int mid = left + (right-left)/2;

            if (k < mid) {
                right = mid -1;
            }

            else{
                left = mid+1;
            }



        }
        
        return 0;
    }


    public static void main(String[] args) {
        KthMissingPositiveNumber KthMissingPositiveNumber  = new KthMissingPositiveNumber();


        int[] arr = {2,3,4,7,11};
        KthMissingPositiveNumber.findKthPositive(arr,5);

        System.out.println(KthMissingPositiveNumber.findKthPositive(arr,5));
    }
}
