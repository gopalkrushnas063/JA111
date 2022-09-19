package evaluation_sprint3.question_4;
/*
* Q.4
a. What are the benefits of using an abstract method?
b. Explain with an appropriate code example
* */

/*......................................................
* Answer : Abstract method can only be used in an abstract class , and it does not have a body .
*          The body is provided by the subclass which is inherited from that class.
* */
public class AbstractMethod {
    public static void main(String[] args) {
        Math sq = new Square();
        System.out.println(sq.calculation());

    }
}

abstract class Math{
    abstract int calculation();
}

class Square extends Math{
    int num = 4;
    @Override
    int calculation(){
        return num*num;
    }
}
