package ja111.day4;

public class _5Clear_Kth_Bit {
    public static void main(String[] args){
        //1. Left shift
        //2. Complement
        //3. Bit-wise & operator
        int n = 24;
        int k = 3;
        int i =1;
        i=i<<k;
        System.out.println((~i) & n);
    }
}
