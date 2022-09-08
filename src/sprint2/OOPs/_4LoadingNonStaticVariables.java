package sprint2.OOPs;

public class _4LoadingNonStaticVariables {
    int nonStatic = 90;
    static int staticInt = 100;
    public static void main(String[] args) {
        System.out.println(staticInt);
        //System.out.println(nonStatic); //Non-static field 'nonStatic' cannot be referenced from a static context

        // how to load nonStaticInt into the memory?
        // we need to create an object

        _4LoadingNonStaticVariables object = new _4LoadingNonStaticVariables();
        System.out.println(object.nonStatic);
        // 1. There are separate static and non-static areas.

        Student s1 = new Student();
        s1.name = "Gopal";
        s1.age = 24;
        System.out.println(s1.name + "'s age is "+s1.age);
        System.out.println(Student.batchName);


        //static : related to the class not to the object
        //Never access anything from a null object
    }
}

class Student{
    String name;
    int age;
    static String batchName = "JA111";
}


// assignment : 5 min :


class AnotherClass{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gopal";
        s1.age = 24;
        //System.out.println(batchName); ? Why
        // how to print the batch name?
    }
}