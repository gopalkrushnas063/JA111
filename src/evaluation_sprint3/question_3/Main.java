package evaluation_sprint3.question_3;
/*
* Q.3
What is the significance of using the final keyword with the following programming
constructs.
a. variable
b. method
c. class
* */


/*Java "Final" keyword is used to denote constants. It can be used with variables , methods and classes.
* Once anyone means variable , method or class is declared , it can be assigned once .
* i.  The final variable cannot be reinitialized with another value.
* ii. The final method can't be overridden.
* iii.The final class can't be extended.
*
 */
// I have write some examples of final method , variable and class below,


public class Main {
    public static void main(String[] args) {
        final int age = 24;
        //age = 45;
        //System.out.println(age); // cannot assign a value to final variable age
    }
}

// (Final) Method
class FinalMethodCheck{
    public final void check(){
        System.out.println("Final method");
    }
}

class CheckFinal extends FinalMethodCheck{
/*    public final void check(){
*        System.out.println("Final method");
*    }
*   check() in evaluation_sprint3.question_3.CheckFinal cannot override check() in evaluation_sprint3.question_3.FinalMethodCheck
*   overridden method is final*/
}


// (Final) Class
final class FinalClass{
    public void check(){
        System.out.println("Final Class");
    }
}
// cannot inherit from final evaluation_sprint3.question_3.FinalClass
//class ChceckFinalClass extends FinalClass{
//
//}