package day_9_JA111_Assignment.question_2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        animals[0] = cat;
        animals[1] = dog;
        animals[2] = tiger;

        animals[0].makeNoise();
        animals[0].eat();
        animals[0].walk();

        animals[1].makeNoise();
        animals[1].eat();
        animals[1].walk();

        animals[2].makeNoise();
        animals[2].eat();
        animals[2].walk();

    }
}

class Animal{
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Barking...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating meat");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Dog is walking on the road");
    }
}

class Cat extends Animal{
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("meowing...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("cat is eating fish");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Cat is walking");
    }
}

class Tiger extends Animal{
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Raoring...");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Tiger is walking");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Tiger is eating meat");
    }
}
