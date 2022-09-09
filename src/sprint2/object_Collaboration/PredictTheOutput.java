package sprint2.object_Collaboration;

public class PredictTheOutput {
    static int j = 200;
    A  a1 = new A();

    public static void main(String[] args) {
        PredictTheOutput obj = new PredictTheOutput();
        System.out.println(obj.j);//200
        System.out.println(obj.a1); // print address of a1
        obj.a1.funA();
    }
}


class A{
    int x = 10;
    void funA(){
        System.out.println("Inside funA of class A");
    }
}
