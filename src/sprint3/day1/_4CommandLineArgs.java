package sprint3.day1;

public class _4CommandLineArgs {
    // one two
    public static void main(String[] args) {
        //System[] args={"one", "two"};
        System.out.println(args.length);


        //foreach loop to print all the args
        for (String val: args) {
            System.out.println(val);
        }
    }
}

