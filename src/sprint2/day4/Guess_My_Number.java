package sprint2.day4;

import java.util.Scanner;

public class Guess_My_Number {
    public static void main(String[] args) {
        int userNumber;
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);

        do {
            System.out.println("Guess my number(1 - 100)");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("WOOOHOOO.........CORRECT NUMBER!!!!!!!");
                break;
            } else if (userNumber < myNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("Your number is too large");
            }
        }while (userNumber >= 0);
        System.out.println("My number was : " + myNumber);
    }
}
