package sprint2.object_Collaboration;

public class Polymorphism {
    public static void main(String[] args) {
        Sum result = new Sum();
        System.out.println(result.add(4,5));
        System.out.println(result.add(5,8,7));
    }

}

class Sum{
    int add(int x,int y){
        return  x+y;
    }
    int add (int x , int y,int z){
        return x+y+z;
    }
}
