import java.util.Scanner;

public class Sum_Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        Math check = new Math();

        check.sum(a, b, c, d, e);
    }
}


class Math{

    void sum(int a,int b , int c, int d, int e){
        int three_sum = a + b+ c ;
        int two_sum = d + e;
        if(three_sum > two_sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
