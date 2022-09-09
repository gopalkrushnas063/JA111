package sprint2.object_Collaboration.practice_Method;

import java.util.Scanner;

public class Square_Method {

    public static void main(String[] args) {
        System.out.println("Enter number for getting square:");
        Scanner sc = new Scanner(System.in);

        Math_Method sq = new Math_Method();


        int square_num = sc.nextInt();

        System.out.println(sq.square(square_num));
    }
}


class Math_Method{
    int square(int num){
        return num*num;
    }
}