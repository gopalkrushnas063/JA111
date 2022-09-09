package arrayInheritance;

public class _1Array {
    public static void main(String[] args) {
        //syntax: Declaration
        //<datatype>[] <array_name>

        int[] ages; //[0,1,2,.....]

        //syntax for creating
        // new <DataType>[size]
        ages = new int[10];

        //another way
        String[] names = new String[10];
        System.out.println(ages);


        Integer[] integers = new Integer[5];
        for(Integer i:integers){
            System.out.println(i);
        }

        // accessing array item at index 0 in JS
        integers[0] = 10;
        for (int i= 0;i<integers.length;i++){
            integers[i]=i;
            System.out.println(integers[i]);
        }


        /* when (not) to use array ?
        * 1. You know the number of items
        * 2. same data types
        * 3.
        * */

        // another way :
        String[] array = {"one","two","three"};
        //System.out.println(array[-1]);  (java.lang.ArrayIndexOutOfBoundsException)

        // iterating over an array
        //for, while


        /* syntax
        * for(<data_type> loop_variable : name_of_array{
        *  System.out.println(loop_variable);
        *  }
        * */
        for (String item: array){
            System.out.println(item);
        }

    }

}
