package sprint2.day4;

import sprint2.day2.Students;

public class Student {

    int roll;
    String name;
    int marks;
    void displayStudentDetails(){
        System.out.println("Name is : " + name);
        System.out.println("Roll is : " + roll);
        System.out.println("Marks is : "+ marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 24;
        s1.name = "Gopal";
        s1.marks = 300;

        s1.displayStudentDetails();

    }

}
