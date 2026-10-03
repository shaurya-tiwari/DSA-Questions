package strings;
public class ReverseStringII {

    // Apna logic is method ke andar likhein

    public String reverseStr(String s, int k) {
        // 1. String ko char array mein badlo kyunki Java Strings immutable hoti hain
        char[] arr = s.toCharArray();
        
        // 2. Loop jo har baar '2 * k' ka jump lagata hai (agley group pe jaane ke liye)
        for (int i = 0; i < arr.length; i += 2 * k) {
            
            int start = i; // Current group ka starting index
            
            // 3. Wahi safe end index jiske baare mein aapne socha tha!
            // Agar (i + k - 1) array ke bahar jaa raha hai, toh last index le lo.
            int end = Math.min(i + k - 1, arr.length - 1);
            
            // 4. Sirf 'start' se 'end' tak ke hisse ko reverse karne ka logic
            while (start < end) {
                // Characters ko aapas mein swap (exchange) karo
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                // Pointers ko andar ki taraf move karo
                start++;
                end--;
            }
        }
        
        // 5. Array ko wapas nayi String banakar return kar do
        return new String(arr);
    
}

    public static void main(String[] args) {
        // Test Case 1: Standard case
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println("Input: s = \"" + s1 + "\", k = " + k1);
        System.out.println("Output:   " + reverseStr(s1, k1));
        System.out.println("Expected: bacdfeg\n");

        // Test Case 2: Exact 2k length
        String s2 = "abcd";
        int k2 = 2;
        System.out.println("Input: s = \"" + s2 + "\", k = " + k2);
        System.out.println("Output:   " + reverseStr(s2, k2));
        System.out.println("Expected: bacd\n");
        
        // Test Case 3: Jab k se kam characters bache hon
        String s3 = "abc";
        int k3 = 4;
        System.out.println("Input: s = \"" + s3 + "\", k = " + k3);
        System.out.println("Output:   " + reverseStr(s3, k3));
        System.out.println("Expected: cba\n");
    }
}