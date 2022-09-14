package day_8_assignment.question_3;


public class Main{
    static boolean isPrime(int n){
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;

    return true;
}
    public String findAndReturnPrimeNumbers(int[] arr){
        String  result = "";
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i]))
                result+=arr[i]+" ";
        }


            return result;


    }
    public static void main(String[] args){
        Main main = new Main();
        int[] arr = {10,12,5,11,50,14,15};

        if (main.findAndReturnPrimeNumbers(arr).equals(""))
            System.out.println("Prime number not found in the supplied Array");
        else
            System.out.println(main.findAndReturnPrimeNumbers(arr));
    }
}