package sprint2.day1.apnacollege;
import java.util.Arrays;


public class Array_Details {
    public static void main(String[] args){
        int age = 30;
        int phy = 97;
        int chem = 99;
        int eng = 90;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        //System.out.println(marks[0]);

        //length
        //System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //Direct store data in array
        int[] mark = {97,89,98};
    }
}
