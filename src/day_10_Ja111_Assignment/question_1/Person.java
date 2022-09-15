package day_10_Ja111_Assignment.question_1;

public class Person {
    private String name;
    private String gender;

    public static void main(String[] args) {
        String newStudent = generatePerson(new Student());
        System.out.println(newStudent);
    }

    public static String generatePerson(Person person){
        Address personAddress = new Address("Puri","Odisha","751007");
        Student s1 = new Student(127,"Java",70000,personAddress);
        return ("Student ["+"studentId="+s1.studentId+" ,courseFee="+s1.courseFee+" , courseEnrolled="+s1.courseEnrolled+",address = Address [city"+s1.address.city+",state="+s1.address.state+" ,pincode="+s1.address.pinCode+"]]");
    }

}


class Address{
    String city;
    String state;
    String pinCode;

    public Address(String city, String state, String pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
}

class Instructor extends Person{
    int instructorID;
    int salary;
    Address address;

    public Instructor(int instructorID, int salary, Address address) {
        this.instructorID = instructorID;
        this.salary = salary;
        this.address = address;
    }
}

class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;
    Address address;

    public Student(int studentId, String courseEnrolled, int courseFee, Address address) {
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
        this.address = address;
    }

    public Student() {

    }
}