package sprint2.day1.apnacollege;

import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int myNumber = (int)(Math.random()*100);
        do{
            System.out.println("Guess my number (1 - 100) ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("WOOOHO......CORRECT NUMBER!!!");
                break;
            }else if(userNumber > myNumber){
                System.out.println("Your Number Is too Large");
            }else {
                System.out.println("Your number is too small");
            }
        }while (userNumber >= 0);
        System.out.println("My number was : " + myNumber);

    }
}
