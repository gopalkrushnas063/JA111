package sprint2.day1.apnacollege;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            if(i == 3){
                i = i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if(i > 5){
                break;
            }
        }
    }
}
