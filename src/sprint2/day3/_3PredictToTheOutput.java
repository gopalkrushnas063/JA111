package sprint2.day3;

public class _3PredictToTheOutput {

    static  int j = 200;
    A a1 = new A();


    public static void main(String[] args) {
        _3PredictToTheOutput obj = new _3PredictToTheOutput();
        System.out.println(obj.j); //200;

        System.out.println(obj.a1); // print address of a1;
        obj.a1.funA();
    }

}


class A {
    int x = 10;
    void funA(){
        System.out.println("Inside funA of class A");
    }
}