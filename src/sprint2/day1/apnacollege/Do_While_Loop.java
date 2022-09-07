package sprint2.day1.apnacollege;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        System.out.println("-----Do_While-----");


        int n;
        do{
            System.out.println("Input a number : ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println("Here is your number" );
            System.out.println(n);

        }while (n>=0);
        System.out.println("THE END");
    }
}
