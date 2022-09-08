package sprint2.OOPs;

public class _5StaticVariables {
    static int x;
    int y;


    public static void main(String[] args) {
        _5StaticVariables obj1 = new _5StaticVariables();
        obj1.x = 10;
        obj1.y = 20;

        _5StaticVariables obj2 = new _5StaticVariables();
        obj2.x = 50;
        obj2.y = 30;

        System.out.println(obj1.x);
        System.out.println(obj2.y);
    }
}
