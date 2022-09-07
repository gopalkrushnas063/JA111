package sprint2.day1.apnacollege;

import java.util.Scanner;

public class While_Loops {
    public static void main(String[] args) {
        System.out.println("----While Loop----");
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(n +" x "+ i +" = "+n*i);
            i++;
        }
    }
}
