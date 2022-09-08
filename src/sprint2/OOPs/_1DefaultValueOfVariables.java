package sprint2.OOPs;

public class _1DefaultValueOfVariables {
    int x = 10; //inside a class : instance variable
    // x is non-static


    static int myStaticVar = 0;
    int instanceVariableWithoutValue;

    String string; //default value is null , same for all the user defined objects as well.

    public static void main(String[] args) {
        // this area is static
        int y = 5; // inside a method : local variable
        System.out.println(y);
        //System.out.println(x);

        _1DefaultValueOfVariables object = new _1DefaultValueOfVariables();
        System.out.println("instanceVariableWithoutValue "+object.instanceVariableWithoutValue);


        int localVariableWithoutValue; // no default value
        //need to initialize otherwise it will through an error
        //System.out.println(localVariableWithoutValue);


        System.out.println(myStaticVar);
    }
}
