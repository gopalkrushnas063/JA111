package ja111.day1;

public class Hello {
    public static void main(String[] args){
        //it will insert empty line before the next statement.
        System.out.println("Hello Java");
        System.out.println(90);
        multiplication();
        System.out.println("back to main");
    }

    static void multiplication(){
        System.out.println("inside the multiplication method");
        int a=10;
        int y=7;
        System.out.println(a*y);

    }
}
