
//Explain the difference between == operator and equals() method
//with a code example.

/*
* Answer : In java == and equals() method is used for checking the equality of two variables or object.
* == is a rational operators which check if the value of two variables are equal or not, if yes it returns true else returns false.
* equals() is a method available in object class and is used to compare objects for equality.
* */

package evaluation_sprint2;

public class Question_1 {
    public static void main(String[] args) {
        String str1 = new String("Gopal");
        String str2 = new String("Gopal");

        // == operator or reference comparison:
        System.out.println(str1 == str2); // false
        System.out.println(5 == 5); // true
        // Content comparison :
        System.out.println(str1.equals(str2)); //true
        System.out.println("masai" == "masai"); //true

     }
}
