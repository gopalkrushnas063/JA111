package day_8_assignment.question_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputArr[][] = new int[5][5];

        System.out.println("Enter the number of rows : ");
        int noOfRows = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        int noOfCols = scan.nextInt();

        int noOfElements = noOfRows * noOfCols;

        System.out.println("Please enter " + noOfElements + " elements nows.");

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfRows; j++) {
                inputArr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        System.out.println("The Input array is :");
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfRows; j++) {
                System.out.print(inputArr[i][j] + "\t");
            }
            System.out.println();
        }

        //Even Sum in Columns
        System.out.println("Output of Even Sum in Columns are : ");
        for (int i = 0; i <noOfRows ; i++) {
            int sumCol = 0;
            for (int j = 0; j <noOfCols ; j++) {
                if(inputArr[j][i] % 2 == 0){
                    sumCol+=inputArr[j][i];
                }
            }

            System.out.println(sumCol);

        }
    }
}
