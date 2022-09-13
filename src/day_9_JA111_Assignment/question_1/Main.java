package day_9_JA111_Assignment.question_1;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly();
        Parrot sing = (Parrot) b1;

        sing.sing();
    }
}

class Bird{
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Parrot extends Bird{
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }

    public void sing(){
        System.out.println("I am Singing");
    }
}
