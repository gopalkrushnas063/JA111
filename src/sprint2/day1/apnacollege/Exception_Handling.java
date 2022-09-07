package sprint2.day1.apnacollege;

public class Exception_Handling {

    public static void main(String[] args) {
        int[] marks = {97,98,95};
        try{

            System.out.println(marks[5]);

        }catch (Exception exception){
            //do something after catching
        }
        System.out.println("The student name is Gopal");
    }
}
