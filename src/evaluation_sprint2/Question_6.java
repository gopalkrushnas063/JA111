package evaluation_sprint2;

import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check result = new Check();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        result.printRes(str,integer);
    }
}

class Check{
    void printRes(String s,int i){

        System.out.println("The required output is :  "+s.substring(0,i));
    }
}
