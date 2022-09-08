package sprint2.day5;

public class _6Immutability {
    //Strings are immutable. (constant or unchanged)
    public static void main(String[] args) {
        String s = "hi"; // ["hi"] s
        String temp = s; // ["hi"] s-> "hi" temp -> s -> "hi"  temp -> "hi"
        s = s+s; // ["hi","hihi"] s -> "hihi" temp -> "hi"
        System.out.println(s); // s -> "hihi"

        
        /* int x = 10;
        *  x = 5;
        * */
        System.out.println(temp); // temp -> "hi"

        /* String password = "xyz";
         * password = "newPassword";*/
        String s1 = s+"there";
        System.out.println(s1);
        /* drawbacks of immutability
        *
        */

        String longitude = "34.565452";
        String latitude = "56.5452";
        String longitude1 = "34.565452";
        String latitude1 = "56.5452";


        //"abcd" reverse "dcba"

        StringBuilder stringBuilder = new StringBuilder("mutable");
        stringBuilder.append("appended");
        System.out.println(stringBuilder);
        String string = "immutable";
        string.concat("appended");
        System.out.println(string);


        stringBuilder.toString();
        //conversion from StringBuilder to string
        StringBuilder builder = new StringBuilder(string);
        //StringBuilder not much in use

        //compareTo
        System.out.println("abc".compareTo("xyz"));
        System.out.println("a".compareTo("b"));
        System.out.println("a".compareTo("a"));
        System.out.println("b".compareTo("a"));
    }
}
