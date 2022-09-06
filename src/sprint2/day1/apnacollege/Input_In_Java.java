package sprint2.day1.apnacollege;

import java.util.Scanner;


public class Input_In_Java {
    public static void main(String[] args){
        //How to take INPUT?
        Scanner sc = new Scanner(System.in);
        //System.out.println("Input your age : ");
        //int age = sc.nextInt();
        //System.out.println(age);


        //Input taking a single word
        //System.out.println("Input your name : ");
       // String name = sc.next();

        //System.out.println(name);

        //input taking a complete Line
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
