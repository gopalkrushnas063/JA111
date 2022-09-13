package sprint3.day1;

public class _2NumberOfRowAndColums {
    public static void main(String[] args) {
        //int[] a = new int[5];
        int row = 2;
        int column = 3;
        int[][] matrix = new int[row][column];

        numOfRandC(matrix);
    }

    static void numOfRandC(int[][] matrix){
        System.out.print("Number of rows? : ");
        System.out.println(matrix.length);
        System.out.print("Number of columns ? : ");
        System.out.println(matrix[0].length);
    }
}
