package ja111.day4;

public class _8Element_Once_In_The_array {
    public static void main(String[] args){
        int arr[] = {2,3,4,3,2,7,4};
        int top = arr[0];
        for(int i=1;i< arr.length;i++){
            top = top^arr[i];
        }
        System.out.println(top);
    }
}
