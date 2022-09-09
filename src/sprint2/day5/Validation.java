package sprint2.day5;

import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validate user = new Validate();

        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        user.authentication(username ,password);
    }
}


class Validate{
    void authentication(String uname,String pwd){
        if(uname.equals("Admin") && pwd.equals("1234"))
        {
            System.out.println("Authentication Successful");

        }
        else
        {
            System.out.println("Invalid Username or password");
        }
    }
}
