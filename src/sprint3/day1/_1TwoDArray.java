package sprint3.day1;

public class _1TwoDArray {
    public static void main(String[] args) {
        //int[] a = new int[5];
        int row = 2;
        int column = 3;
        int[][] matrix = new int[row][column];
        int variable = 0;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <column ; j++) {
                //set
                matrix[i][j] = variable;
                variable++;
            }
        }


        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
