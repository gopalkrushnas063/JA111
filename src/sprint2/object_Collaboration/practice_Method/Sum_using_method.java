package sprint2.object_Collaboration.practice_Method;

public class Sum_using_method {
    public static void main(String[] args) {
        Math res = new Math();


        System.out.println(res.sum(2,5));
    }
}

class Math{
    int sum (int x,int y){
        return x+y;
    }
}
