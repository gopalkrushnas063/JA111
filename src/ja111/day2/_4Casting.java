package ja111.day2;

public class _4Casting {
    public static void main(String[] args){
        byte myByte = 10;
        int myInt = myByte;

        int anotherInt = 2000;
        byte anotherByte = (byte)anotherInt;
        System.out.println(anotherByte);

        int i = 10;
        byte b = (byte)i;
        System.out.println(b);

        //ASCII value? a 65 , b 66, A=96

        char c = 'A';
        int anotherInteger = c;
        System.out.println(anotherInteger);
        int asciiValofZ = 'z';
        System.out.println(asciiValofZ);


        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1+b2);
        System.out.println(b3);
        //-128 to 127

        byte a1 = 125;
        byte a2 = 3;
        byte a3 = (byte)(a1+a2);
        System.out.println(a3);
    }
}
