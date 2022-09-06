package sprint2.day3;
import java.lang.Math;

public class Prime_Factors {
    public static void main(String[] args) {
        int n = 12;
        System.out.println("Factors of " + n + " are: ");

        for (int i = 1; i <= n; ++i) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }


}
