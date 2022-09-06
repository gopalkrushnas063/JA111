package sprint2.day1.apnacollege;

public class Logical_operators {
    public static void main(String[] args){
        // Logical Operators
        // &&
        int a = 30;
        int b = 40;
        if(a<50 && b<50)
            System.out.println("Both less than 50");

        if(a < 50 || b < 50)
            System.out.println("At-least less than 50");

        boolean isAdult = false ;
        if(!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");
    }
}
