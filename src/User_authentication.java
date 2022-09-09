import java.util.Scanner;

public class User_authentication {
    public static void main(String[] args) {
        Validate_Credentials user = new Validate_Credentials();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String uname = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();

        user.login(uname,password);
    }
}

class Validate_Credentials {
    static void login(String username,String password){
        if(username.equals("Admin") && password.equals("1234")){
            System.out.println("Authentication Successful!!!");
        }else{
            System.out.println("Invalid username and password");
        }
    }
}
