package sprint2.day3;

public class _6Polymorphism {
    public static void main(String[] args) {
        Math sum = new Math();
        System.out.println(sum.add(2,5));
        System.out.println(9);
        System.out.println(sum.square((byte)5.9));
    }

}

class Math{

    //Polymorphism
    /*
    * 1. static binding , compile time polymorphism , method overloading
    * 2. we will learn later.
    * */
    int add (int x, int y){
        return  x+y;
    }

    String add(int x,int y,int z){
        return "x+y+z";
    }
    
    int square (int x){
        System.out.println("Int");
        return x*x;
    }
    
    int square(byte b){
        System.out.println("Byte");
        return b*b;
    }
}
