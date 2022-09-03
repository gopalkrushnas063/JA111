package ja111.day3;

public class _1ObjectDemo {
    public static void main(String[] main){
        //create object of the class A
        //let a = new A();
        //syntax
        //Type var_name = new class()
        A a= new A();
        A a1=new A();
        a.sayHello();
    }
}

class A{
    int variable = 10;
    void sayHello(){
        System.out.println("Hello");
    }

    A(){
        System.out.println("Constructor called");
    }
}

