package sprint3.day1.Inheritance;

public class _1InheritanceDemo {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim();

        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        dolphin.jump();
       // fish.jump();
    }
}


class Fish{
    void swim(){
        System.out.println("Fish is swimming");
    }
}
//Fish : Parent Class, Super Class , Base Class
//Dolphin : Child Class , Sub Class , Derived Class
class Dolphin extends Fish{
    /* Benefits :
    * Code reuse.
    * void swim(){
    *   System.out.println("Fish is swimming");
    }*/
    void jump(){
        System.out.println("Dolphin is jumping....");
    }
}
