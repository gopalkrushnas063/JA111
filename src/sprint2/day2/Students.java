package sprint2.day2;

public class Students {
    //state : variables
    int age;
    String name;
    static String batchName = "JA111";//JA111

    //behaviour : methods
    void play(){
        System.out.println(name +" is playing...");
    }
    public static void main(String[] args){
        Students s1 = new Students();
        s1.age = 24;
        s1.name = "Gopal";
        //syntax :
        // <objectName>.<methodName>
        s1.play();
        System.out.println(s1.age+" "+s1.name);
        System.out.println(Students.batchName);
        Students s180 = new Students();

        Students student;
        student = s1;
        //static = related to the class not to the object
        System.out.println(student);

        Students studentNullObject = null;
        //Null Pointer Exceptions(.NullPointerException) :
        //System.out.println(studentNullObject.name);
    }
}


//assignment : 5 min:
class AnotherClass{
    public static void main(String[] args){
        Students s1 = new Students();
        s1.age = 24;
        s1.name = "Gopal";
        // System.out.println(batchName); ? why
        // how to print the batch name?
    }
}