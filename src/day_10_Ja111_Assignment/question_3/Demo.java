package day_10_Ja111_Assignment.question_3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amt = sc.nextInt();

        System.out.println(provideFood(amt));
    }

    public static String provideFood(int amount){
        Hotel h1 = new Hotel();
        if(amount > 1000){
            return h1.tajHotel();
        }else if(amount > 200 && amount < 1000){
            return (String) h1.roadSideHotel();
        }


        return "Please enter a valid amount";
    }
}
class Hotel{
    String tajHotel(){

        return ("TajHotel");
    }

    Object roadSideHotel(){

        return ("Road Side Hotel");
    }
}

class TajHotel extends Hotel{
    @Override
    String tajHotel() {
        super.tajHotel();
        return null;
    }
}

class RoadSideHotel extends Hotel{
    @Override
    Object roadSideHotel() {
        super.roadSideHotel();
        return null;
    }
}