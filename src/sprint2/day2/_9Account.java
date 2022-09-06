package sprint2.day2;

public class _9Account {
    String customerName; // customer name
    double balance;
    static String bankName;
    public static void main(String[] args){
        _9Account.bankName = "HDFC";
        _9Account yourAccount = new _9Account();
        yourAccount.balance = 5464664646.556;
        yourAccount.customerName = "Gopal";

        _9Account myAccount = new _9Account();
        myAccount.customerName = "myName";
        myAccount.balance = 846564.77;

        System.out.println(yourAccount.customerName +" "+ yourAccount.balance);
        System.out.println(_9Account.bankName);

    }
}
