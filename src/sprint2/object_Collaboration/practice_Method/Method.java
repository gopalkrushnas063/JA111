package sprint2.object_Collaboration.practice_Method;

public class Method {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.methodName();
        int factorial = simple.factorial(5);
        System.out.println(factorial);
    }
}


class Simple{
    void methodName(){
        System.out.println("Inside the body of the method");
    }

    int factorial(int a){
        if(a == 1 || a == 2){
            return  a;
        }else{
            return a*factorial(a-1);
        }
    }
}
