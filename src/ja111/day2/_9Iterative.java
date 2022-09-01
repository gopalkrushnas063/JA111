package ja111.day2;

public class _9Iterative {
    public static void main(String[] args){
        //for
        //do while
        //while

        for(int i =0;i<5;i++){
            System.out.println("For Loop");
        }
        int j = 0;
        while(j<3){
            System.out.println("While Loop");
            j++;
        }

        //do while: runs at least once
        int x = 0;
        do{
            System.out.println("Something do while");
            x++;
        }
        while(x<2);
    }


}
