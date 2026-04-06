import java.util.HashSet;

public class uniunof2sortedarray {

    public static void main(String[] args) {

        HashSet<Integer> uniun = new HashSet<>();
        int arr1[] = { 1, 2, 3, 4, 5 }, arr2[] = { 2, 3, 4, 4, 5 };

        for (int i : arr1) {
            uniun.add(i);
        }

        for (int i : arr2) {
            uniun.add(i);
        }
        System.out.print(uniun);
    }

}

// concept
// Sequential Loops: If you have one loop after another, you add them: $O(n + m)
// Nested Loops: If you have a loop inside a loop, you multiply them: $O(n
// \times m). means nXm