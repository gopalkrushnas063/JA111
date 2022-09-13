package day_9_JA111_Assignment.question_3;

public class Main {
    public static void main(String[] args) {
        //.....Employee Details.........
        Employee e1 = new Employee();
        e1.specialisation = "SDE1";
        e1.department = "IT";
        e1.name = "Gopal";
        e1.age = 24;
        e1.phoneNumber = "5646416454648";
        e1.address = "Odisha,Bhubaneswar,751007";
        e1.salary = 60000.54;
        System.out.println(e1.specialisation);
        System.out.println(e1.department);
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.phoneNumber);
        System.out.println(e1.address);
        e1.printSalary();

        //..........Manager...............
        Manager m1 = new Manager();
        m1.specialisation = "Manager";
        m1.department = "IT";
        m1.name = "Krishna";
        m1.age = 25;
        m1.phoneNumber = "55646416454648";
        m1.address = "Mumbai,751007";
        m1.salary = 60000.547;
        System.out.println(m1.specialisation);
        System.out.println(e1.department);
        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.phoneNumber);
        System.out.println(m1.address);
        m1.printSalary();
    }
}


class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary(){
        System.out.println(salary);
    }
}

class Employee extends Member{
    String specialisation;
    String department;
}

class Manager extends Member{
    String specialisation;
    String department;
}
