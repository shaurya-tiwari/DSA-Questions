import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int[][] result = new int[intervals.length][];
        for (int i = 0; i < intervals.length; i++) {
            result[i] = new int[intervals[i].length];

            for (int j = 0; j < intervals[i].length; j++) {
                result[i][j] = intervals[i][j];
            }
        }
        System.out.print(Arrays.deepToString(result));
        
        return result;

    }

    public static void main(String[] args) {
        MergeIntervals MergeIntervals = new MergeIntervals();
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};   
        MergeIntervals.merge(arr);
    }
}
