package ja111.day2;

public class _2Operators {
    public static void main(String[] args){
//        int a = 10;
//        System.out.println(a);
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(a--);
//        System.out.println(--a);
//        System.out.println(a);

        int b = 5;
        System.out.println(++b - ++b);
        //(6 - 7) = -1
        int a = 4;
        System.out.println((--a+--a)*(++a-a--)+(--a+a--)*(++a+a++));

    }
}
