package sprint3.day2;

public class _1CmdLine {
    public static void main(String[] args) {
        if(args.length > 2)
            System.out.println("error");

        int number;
        if(args.length == 1) {
            String num = args[0];
            number = Integer.parseInt(num);
        }

        if(args.length == 2) {
            String num1 = args[0];
            String num2 = args[1];
            number = Math.abs(Integer.parseInt(num1) - Integer.parseInt(num2));
        }


    }

    static int fact(int num){
        if(num == 1 || num == 2) return num;
        else return num*fact(num-1);
    }
}
