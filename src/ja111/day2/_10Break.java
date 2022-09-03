package ja111.day2;

public class _10Break {
    public static void main(String[] args){
        for(int i=0;i<50;i++){
            System.out.println("Break Demo");
            if(i==2){
                break;
            }
        }
        for(int outer = 0;outer<5;outer++){
            System.out.println("Outer"+outer);
            for (int inner = 0;inner<2;inner++){

                if(inner == 1)
                    break;

                System.out.println("Inner"+inner);

            }
        }

        while(true){
            System.out.println("this is reachable");
            break;
            //unreachable
            //System.out.println("Hi");
        }

        System.out.println("Out of while loop");
    }
}
