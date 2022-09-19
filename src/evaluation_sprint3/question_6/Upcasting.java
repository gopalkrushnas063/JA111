package evaluation_sprint3.question_6;
/*
* Q.6
a. What is object upcasting?
b. Explain with a code example.
*
* Answer :
* i.  A child object is typecasted to a parent object.
* ii. We can perform upcasting implicitly or explicitly
* iii.In the child class , we can access the method and variables of the parent class.
* iv. We can access some specified methods of the child class.
* */
public class Upcasting {
    public static void main(String[] args) {
        Parent object_1 =(Parent) new Child();
        Parent object_2 =(Parent) new Child();

        object_1.checkFunction();
        object_2.checkFunction();
    }
}


class Parent {
    void checkFunction(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    void checkFunction(){
        System.out.println("Child Class");
    }
}
