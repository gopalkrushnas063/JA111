package sprint3.day1;

public class _3InitializeAMatrix {
    public static void main(String[] args) {
        int[] a = {2,3};
        int[][] mat = {
                {0,1,2}, // 0
                {3,4}, // 1
                {5}
        };

        System.out.println(mat[1][1]);
        System.out.println(mat[1][4]); // undefined

        for (int[] val: mat
             ) {
            System.out.println(val);
        }
    }
}
