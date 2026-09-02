import ARRAY.recurrealitn;

public class SingleElementinaSortedArray {
    
    public int singleNonDuplicate(int[] nums) {
        
        int uniquexor = 0 ;

        for (int i : nums) {
            uniquexor ^=i;
        }

        
        return uniquexor;

        



    }

    public static void main(String[] args) {
        
    }
}
