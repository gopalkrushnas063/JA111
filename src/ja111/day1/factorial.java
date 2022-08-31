package ja111.day1;

public class factorial {
    public static void main(String[] args){

        System.out.println("Factorial Of A Number");
        factorial();
    }

    static void factorial(){
        int i;
        int fact = 1;
        int num = 4;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
