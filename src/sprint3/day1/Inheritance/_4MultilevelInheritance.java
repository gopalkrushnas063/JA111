package sprint3.day1.Inheritance;

public class _4MultilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.facialFeatures();
    }

}

class Grandparent{
    void facialFeatures(){
        System.out.println("Facial Features");
    }
}
class Parent extends Grandparent{}
class Child extends Parent{}