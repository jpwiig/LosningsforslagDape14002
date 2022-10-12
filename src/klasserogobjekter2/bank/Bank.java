package klasserogobjekter2.bank;

public class Bank {

    public static void main(String[] args) {
        Account newAcc = new Account("Per", "1203948718", 199999);
        //methods
        newAcc.chckbalance();
        newAcc.addbalance(1);
        newAcc.remove(100);
    }

}
