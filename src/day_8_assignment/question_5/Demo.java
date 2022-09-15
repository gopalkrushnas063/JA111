package day_8_assignment.question_5;


import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Student obj = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student strength : ");
        int num = sc.nextInt();
        Student student_arr[] = new Student[num];
        for (int i = 0; i < num ; i++) {
            Student s1 = new Student();
            System.out.print("Enter your name : ");
            s1.setName(sc.next());
            System.out.print("Enter your address : ");
            s1.setAddress(sc.next());
            System.out.print("Enter your roll number : ");
            s1.setRoll(sc.nextInt());
            System.out.print("Enter your score : ");
            s1.setMarks(sc.nextInt());

            student_arr[i] = s1;
        }

        for (int i = 0; i < student_arr.length; i++) {
            System.out.println(student_arr[i].method());
        }

    }


}


class Student{
    private int roll;
    private String name;
    private String address;
    private int marks;

    public Student(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public Student() {

    }


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String method() {
        return "Name : "+name +" || Roll No : "+ roll +" || Address : "+address +" || Marks : "+marks;
    }
}