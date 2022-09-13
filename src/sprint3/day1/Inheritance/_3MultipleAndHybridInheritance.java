package sprint3.day1.Inheritance;

public class _3MultipleAndHybridInheritance {
    public static void main(String[] args) {

    }
}
class Pet{
    void speak(){
        System.out.println("Pet is making sound...");
    }
}
class Dog extends Pet{
    @Override
    void speak(){
        System.out.println("Barking.....");
    }
}


class Cat extends Pet{
    @Override
    void speak(){
        System.out.println("Meaowe");
    }
}

//class MultipleInheritance extends Dog,Cat{  }