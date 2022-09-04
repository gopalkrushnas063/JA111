package ja111.day4;

public class _3Check_Kth_Bit {
    public static void main(String[] args){
        int n = 12;
        int k = 3;
        int i;
        i=1;
        i=i<<k;
        System.out.println("Check Kth Bit");
        System.out.println((n&i)!=0);
    }
}
