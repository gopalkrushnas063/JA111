package ja111.day2;

public class _4Casting {
    public static void main(String[] args){
        byte myByte = 10;
        int myInt = myByte;

        int anotherInt = 2000;
        byte anotherByte = (byte)anotherInt;
        System.out.println(anotherByte);
    }
}
