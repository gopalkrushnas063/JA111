package sprint2.object_Collaboration.practice_Method;
import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        // Java Scanner String input example
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + " is a nice name!");

    }
}
