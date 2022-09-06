package sprint2.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class _8StaticVariables {
    static  int x;
    int y;
    public static void main(String[] args){
        _8StaticVariables obj1 = new _8StaticVariables();
        obj1.x = 10;
        obj1.y = 20;



        _8StaticVariables obj2 = new _8StaticVariables();
        obj2.x = 50;
        obj2.y = 20;

        System.out.println(obj1.x);
        //System.out.println(obj2);


        //another way to access the static variables
        _8StaticVariables.x = 100;
        System.out.println(obj1.x);


        // diff b/n static vs non-static members
        //attribute ------------------- static                      ------------ non-static
        // belong to ------------------ class                                      object
        //How to access?             className.x                                  Object.x
        //when are they init? | before running(at the time of class load)  | at the time of object creation
        // sharing                   same copy is shared                          own copy
        // e.g.                      bank name, ifsc                              account No, customer Email

    }
}
