public class PayPal extends Payment{
    public void deposit(int money){
        super.totalBalance+=money;
    }

    public int withDraw(int money){
        if(totalBalance>money){
            super.totalBalance-=money;
            System.out.println(totalBalance+" is your Balance Money");
            return totalBalance;
        }
        System.out.println("no Sufficient Balance");
        return 0;
    }
    public boolean paymentProcess(int money){
        if(totalBalance>money){
            withDraw(money);
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        PayPal payPal=new PayPal();
        payPal.deposit(1000);
        payPal.paymentProcess(500);
        payPal.withDraw(300);
       System.out.println( payPal.checkTotalBalance());;
    }
}
