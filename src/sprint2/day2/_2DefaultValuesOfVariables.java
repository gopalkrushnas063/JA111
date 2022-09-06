package sprint2.day2;

public class _2DefaultValuesOfVariables {
    int x = 10; // inside a class: instance variables
    static int myStaticVariable = 0;
    int instanceVariableWithoutAValue;
    String string;//default value will be null, same for all the user defined
    //x is non-static
    public static void main(String[] args){


        //this area is static
        int y = 5; //inside a method : local variable
        System.out.println(y);
        // System.out.println(x);
        //System.out.println(myStaticVariable);
        _2DefaultValuesOfVariables object = new _2DefaultValuesOfVariables();
        System.out.println("instanceVariableWithoutAValue "+object.instanceVariableWithoutAValue);



        int localVariableWithoutAValue; // no default value
        // initialize it
        // localVariableWithoutAValue = 10;
        //System.out.println(localVariableWithoutAValue); // error
    }
}
