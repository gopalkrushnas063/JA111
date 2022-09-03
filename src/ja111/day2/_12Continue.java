package ja111.day2;

public class _12Continue {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            if(i == 1)
                continue;
            System.out.println("Count " + i);
        }
    }
}
