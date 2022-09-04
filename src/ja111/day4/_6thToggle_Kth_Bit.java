package ja111.day4;

public class _6thToggle_Kth_Bit {
    public static void main(String[] args){
        int n = 24;
        //int k = 4;
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);
    }
}
