package klasserogobjekter2.bank;

import com.sun.nio.sctp.SctpStandardSocketOptions;

public class Account {
    private String name;
    private String accountnr;
    private int balance;

    public Account(String name, String accountnr, int balance) {
        this.name = name;
        this.accountnr = accountnr;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnr() {
        return accountnr;
    }

    public void setAccountnr(String accountnr) {
        this.accountnr = accountnr;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void addbalance(int add){
        balance+= add;
    }
    public boolean chckbalance (){
        if (balance > 0) return false;
        return true;
    }
    public void remove(int use){
        if (!chckbalance()) System.out.println("Error in withdraw");
        if (use > balance) System.out.println("Trying to draw more than is in your account");
         else{
            balance -= use;
            System.out.println("New balance" + balance);
        };

    }
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountnr='" + accountnr + '\'' +
                ", balance=" + balance +
                '}';
    }
}
