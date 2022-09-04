package ja111.day4;

public class _4Set_Kth_Bit {
    public static void main(String[] args){
        int n = 27;
        int k = 3;
        int i;
        i = 1;
        i = i<<k;
        System.out.println("Set Kth Bit[Assume LSB starts from 0-indexing]");
        System.out.println((n|i));
        System.out.println("---------------------------------------------------");
        System.out.println(n|1<<k);
    }
}
