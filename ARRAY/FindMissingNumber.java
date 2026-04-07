public class FindMissingNumber {

    /// BFS
    public int missingNum() {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        int n = arr.length + 1;
        int Sum = 0;

        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
        int expected = (n * (n + 1) / 2) - Sum;

        return expected;
    }

    // XOR TECHNIQUE
    public void XORmissingNum() {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        int n = arr.length + 1; // here we take +1 because the value which is misng but the space is stil there

        int XOR1 = 0;
        int XOR2 = 0;

        for (int i = 0; i <= n; i++) {
            // DOING XOR OF ALL THE NUMBER 1ST
            XOR1 = XOR1 ^ i; // here all the element are doing XOR by themselve , 88 22 33 55

        }

        // XOR FOR REMAINING ITEM IN ARRAY AFTER , DOING ZOR OF THE ALL TEH VALUE
        for (int num : arr) {
            XOR2 = XOR2 ^ num;
        }

        int missxor = XOR1 ^ XOR2;
        System.out.println(missxor);

    }

    public static void main(String[] args) {
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        findMissingNumber.XORmissingNum();
        // System.out.println(findMissingNumber.missingNum());

    }
}

// formula : Expected Sum} = n (n + 1)/2