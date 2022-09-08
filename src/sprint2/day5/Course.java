package sprint2.day5;
import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;
    void displayCourseDetails(){
        System.out.println("-------------------------------------");
        System.out.println("------------Course Details-----------");
        System.out.println("-------------------------------------");
        System.out.println("Course Name : "+courseName);
        System.out.println("Course ID : "+courseId);
        System.out.println("Course Fee : "+courseFee);
    }

    public static void main(String[] args) {

        authenticate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course Name:");
        String course_name = scanner.nextLine();
        System.out.println("Enter Course ID:");
        int course_ID = scanner.nextInt();
        System.out.println("Enter Course Fee:");
        int course_fee = scanner.nextInt();

        Course student = new Course();
        student.courseFee = course_fee;
        student.courseId = course_ID;
        student.courseName = course_name;



        student.displayCourseDetails();

    }

    static void authenticate(){
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals("Admin") && password.equals("1234"))
        {
            System.out.println("Authentication Successful");

        }
        else
        {
            System.out.println("Invalid Username or password");
        }
    }

}
