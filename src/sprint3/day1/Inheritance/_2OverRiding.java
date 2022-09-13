package sprint3.day1.Inheritance;

public class _2OverRiding {
    public static void main(String[] args) {
        Father father = new Father();
        father.earn();
        You you = new You();
        you.earn();
    }

}

class Father{
    void earn(){
        //1.
        System.out.println("Earn by running a business");
    }
}


class You extends Father{

    @Override
    void earn(){
        //1.
        System.out.println("Earn by running a business");
        System.out.println("Earn from software enginnering day job");
    }
}