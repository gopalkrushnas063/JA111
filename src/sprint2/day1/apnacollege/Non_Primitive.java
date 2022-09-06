package sprint2.day1.apnacollege;

public class Non_Primitive {
    public static void main(String[] args){
        String name1 = "Krishna";
        String name = new String("Gopal");
        System.out.println(name.length());

        //Strings
        //concatenate
        String name2= "Krishna";
        String name3 = "Hari";
        System.out.println(name1 +" and "+ name3);

        //charAt()
        System.out.println(name.charAt(0));

        //length
        System.out.println(name.length());

        //replace
        String name4 =  name.replace('a','u');
        System.out.println(name4);


        //substring
        String name5 = "Aman and Akku";
        System.out.println(name5.substring(0,4));
    }
}
