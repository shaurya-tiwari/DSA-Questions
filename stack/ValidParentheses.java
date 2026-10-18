import java.util.Stack;

public class ValidParentheses {

   public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        // Tarika 2: String ko characters me tod kar loop lagaya (Fast and clean)
        for (char ch : s.toCharArray()) { 
            
            // Agar opening bracket aaya, toh uska closing partner dabbe me daal do
            if (ch == '(') {
                st.push(')');
            } 
            else if (ch == '{') {
                st.push('}');
            } 
            else if (ch == '[') {
                st.push(']');
            } 
            // Agar closing bracket aaya, toh seedha dabbe se nikalkar match karo
            else if (st.isEmpty() || st.pop() != ch) {
                return false; // Khali dabba ya jodi match nahi hui toh direct false
            }
        }
        
        // Aakhiri check: Agar dabba khali toh true, warna false
        return st.isEmpty(); 
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        // Test Case 1: Sahi (Valid)
        System.out.println("Test 1 '()' : " + vp.isValid("()")); // Expected: true

        // Test Case 2: Sahi (Valid)
        System.out.println("Test 2 '()[]{}' : " + vp.isValid("()[]{}")); // Expected: true

        // Test Case 3: Galat (Invalid)
        System.out.println("Test 3 '(]' : " + vp.isValid("(]")); // Expected: false

        // Test Case 4: Galat (Invalid - order galat hai)
        System.out.println("Test 4 '([)]' : " + vp.isValid("([)]")); // Expected: false
    }
}