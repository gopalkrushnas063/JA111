package sprint3.day2;

public class _2WeProblem {
    public static void main(String[] args) {
        HDFC hdfcbank = new HDFC();
        SBI sbibank = new SBI();
        System.out.println(hdfcbank.getRoI());
        System.out.println(sbibank.getRoI());
    }


}

class RBIBank{
    int getRoI(){
        return 0;
    }
}

class HDFC extends RBIBank{

    @Override
    int getRoI() {
        super.getRoI();
        return (8);
    }
}

class SBI extends RBIBank{
    @Override
    int getRoI() {
        super.getRoI();
        return (int)7.5;
    }
}
