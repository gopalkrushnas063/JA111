package sprint2.day5;

public class _4String {
    public static void main(String[] args) {
        String s1 = "value"; // String literal
        String s2 = new String("value"); // string with new operator
        String s3 = "value";

        //create two literal compare their addresses
        //string literal are created on string pool (PERMGEN)
        //string poop [value].........It does not allow to create duplicate.
        System.out.println(s1 == s3); //true

        //in the heap area a new object is created.
        String s4 = new String("P");
        String s5 = new String("P");
        System.out.println(s4 == s5); //false

    }
}
