package ja111.day4;

public class _1isPowerOfTwo {
    public static void main(String[] args){
        int n = 28;
        if(n <= 0) {
            System.out.println("False");
        }
        else{
            while (n % 2 == 0) {
                n = n / 2;
            }
        }
        if(n==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
