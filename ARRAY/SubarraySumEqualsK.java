import java.util.HashMap;
import java.util.Hashtable;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int cont = 0;
        int currentsum =0;
        
        
        HashMap<Integer,Integer> prefixmap = new HashMap<>();
        if (prefixmap.containsKey(currentsum)) {
    currentsum++;
}
        for (int i : nums) {
            currentsum = currentsum+i;
            int target = currentsum-k;

            if (prefixmap.containsKey(target)) {
                cont = cont +prefixmap.get(target);
            }


            if (prefixmap.containsKey(currentsum)) {
                currentsum++;

            }
            else{
                prefixmap.put(currentsum, 1);
            }
        }

       

        return cont;
    }
}