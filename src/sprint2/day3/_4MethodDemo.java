package sprint2.day3;

public class _4MethodDemo {
    public static void main(String[] args) {
        //call a method
        Simple simple = new Simple();
        simple.methodName();


        int factorial = simple.factorial(5);
        System.out.println(factorial);
        System.out.println(simple.factorial(2));


        System.out.println(simple.sum(5,10));


        Simple.staticMethod();
    }
}


class Simple{

    static void staticMethod(){
        System.out.println("I am static method");
    }
    void methodName(){
        System.out.println("Inside the body of the method");
    }

    int factorial(int num){
        if(num == 1 || num==2)
            return num;
        else
            return num*factorial(num-1);
    }

    int sum(int x , int y){
        printSum(x+y);
        return x+y;
    }


    void printSum(int a){
        System.out.println("Print Sum : "+ a);
    }
}
