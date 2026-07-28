import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> currentlist = new ArrayList<>();
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    currentlist.add(1);
                }
                else{
                    List<Integer> prelistnnumber = list.get(i-1);


                    int leftnum = prelistnnumber.get(k-1);
                    int rightnum = prelistnnumber.get(k);


                    currentlist.add(leftnum+rightnum);
                }
            }
            list.add(currentlist);

        }
        return list;
    }

    public static void main(String[] args) {
        pascaltriangle pascaltriangle = new pascaltriangle();
        pascaltriangle.generate(5);
        System.out.println(pascaltriangle.generate(5));
    }
}
