
//  we cant use hashmap because it need to be in o(1)
public class SingleNumber {
    // USE XOR for check 2 numbers are return 0 .
    // when two are same theen last one is cancel 
    public int singleNumber(int[] nums) {

        int number = 0;

        for (int i = 0; i < nums.length; i++) {
            number = number ^ nums[i];
        }
        return number;

    }

    public static void main(String[] args) {
        SingleNumber SingleNumber = new SingleNumber();

        int[] arr = { 2,2,1 };
        System.out.println(SingleNumber.singleNumber(arr));
    }
}


// Iska matlab:

// Pehla 2 aaya -> value 2 bani
// Dusra 2 aaya -> pehle wale 2 ko cancel kar diya
// Sirf 1 bacha