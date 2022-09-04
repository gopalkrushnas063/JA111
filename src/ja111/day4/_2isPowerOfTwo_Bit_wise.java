package ja111.day4;

public class _2isPowerOfTwo_Bit_wise {
    public static void main(String[] args){
        int n = 16;
        System.out.println(n>0 && ((n&(n-1)))==0);
    }
}
