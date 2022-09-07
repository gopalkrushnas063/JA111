package sprint2.day4;

public class Check_Weather {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 80.0;
        if(isRaining || isSnowing || temperature < 50){
            System.out.println("Let’s stay home.");
        }else{
            System.out.println("Let’s go out!");
        }
    }
}
