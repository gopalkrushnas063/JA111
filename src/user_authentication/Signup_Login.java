package user_authentication;

import sprint2.day1.apnacollege.Logical_operators;

import java.util.Scanner;

public class Signup_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //..................Signup............................
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        Signup u1 = new Signup(username,email,password);
        //System.out.print(u1.userId+" "+u1.email+" "+u1.password);

        //.................Login...............................
        System.out.print("Username : ");
        String uname = sc.nextLine();
        System.out.print("Password : ");
        String pwd = sc.nextLine();
        Login l1 = new Login(uname,pwd);
        if(l1.userId.equals(u1.userId) && l1.password.equals(u1.password)){
            System.out.println("User Authentication Validate Successfully");
        }else{
            System.out.println("Invalid Credentials!!");
        }

    }
}


class Signup{
    String userId;
    String email;
    String password;

    public Signup(String userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }
}

class Login{
    String userId;
    String password;

    public Login(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}