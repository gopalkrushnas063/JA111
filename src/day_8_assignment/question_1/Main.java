package day_8_assignment.question_1;
import java.io.*;
import java.util.Scanner;
public class Main{
    public static String reversString(String input){
        char ch;
        String nstr = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            nstr = ch+nstr;
        }
        return nstr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}
