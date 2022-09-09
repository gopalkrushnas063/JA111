package sprint2.object_Collaboration;

public class  Method {
    public static void main(String[] args) {
        //how to call a method
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
    int factorial(int num){
        if(num == 1 || num == 2){
            return num;
        }else{
            return num*factorial(num-1);
        }
    }
}