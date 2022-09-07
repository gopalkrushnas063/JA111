package sprint2.day1.apnacollege;

public class Method_Function {
    public static void printJava(){
        System.out.println("Hello Java");
    }
    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
       printName("Gopal");
       printSum(1,6);
    }
}
