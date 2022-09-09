package arrayInheritance;

public class _3UserDefinedObjectInAnArray {

    public static void main(String[] args) {
        Student[] students = new Student[2];
        Student  s1 = new Student("robot");
        Student s2 = new Student("botnet");
        students[0] = s1;
        students[1] = s2;
        for (Student s:students
             ) {
            System.out.println(s.name);
        }
    }
}
