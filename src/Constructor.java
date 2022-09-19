import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int age = sc.nextInt();

        Const u1 = new Const(age,name);
        System.out.println(u1.name);

    }
}

class Const{
    int age;
    String name;

Const(int age, String name) {
        this.age = age;
        this.name = name;
    }


}