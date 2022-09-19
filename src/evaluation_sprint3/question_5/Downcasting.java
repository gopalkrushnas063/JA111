package evaluation_sprint3.question_5;
/*
* Q.5
a. What is object downcasting?
b. Explain with a code example.
*
* Answer :
* i.  The reference of the parent class object is passed to the child class.
* ii. Implicit downcasting is not possible .
* iii.The method and variables of both the class means parent and child can be accessed.
* iv. All the methods and variables can be accessed by performing downcasting.
*
* */
public class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "Gopal";

       Child check = (Child)p;
        check.age = 24;
        System.out.println(check.name);
        System.out.println(check.age);
        check.function();
    }
}

class Parent{
    String name;

    void function(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{

    int age;
    @Override
    void function(){
        System.out.println("Child Method");
    }
}