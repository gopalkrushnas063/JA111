package arrayInheritance;

public class _2PrintSumAndAverageOfArrayItems {
    public static void main(String[] args) {
        // 1 to 10
        //should print avg,sum

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum/(double)array.length);
    }
}
