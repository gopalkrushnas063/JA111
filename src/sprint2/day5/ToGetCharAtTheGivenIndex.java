package sprint2.day5;

import java.util.Scanner;

public class ToGetCharAtTheGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = sc.nextLine();
        System.out.println("Enter the character position you want to access: ");
        int index = sc.nextInt();
        System.out.println("Character at position 2 is : ");
        System.out.println(string.charAt(index));
    }
}
