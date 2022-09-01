package ja111.day2;

import com.sun.security.jgss.GSSUtil;

public class _3DataTypes {
    public static void main(String[] args){
        int a = 130;
        Integer x = a;
        System.out.println(x);
        /*
         *byte byteVar = (byte)130;
         *System.out.println(byteVar);
         */


        int myInt = 20;
        System.out.println(myInt);
        char myChar = 'a';
        Character characterWrapper = myChar;
        System.out.println(characterWrapper);
        String myString = "ajgagklaghlg";

        Boolean boolWrapper = true;
        //boolean booleanPrimitive = boolWrapper;
        boolean myBool;

        //Use of Wrapper
        //Object
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


        int primDefaultValue = 0; //no default value for variable of method
        Integer wrapperDefaultValue; //null
        String s; // null
    }
}


class A{
    int i;// Default values for class members
}
