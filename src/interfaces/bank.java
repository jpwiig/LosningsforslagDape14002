package interfaces;

import klasserogobjekter2.bank.Account;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class bank implements exampleInterFace{
    private class account{
        private String name;
        private double balance;

        public account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public void addmore (double sum){
            balance = balance + sum;
        }
    }
    private class Values {
        private String name;
        private double rate;

        public Values(String name, double rate) {
            this.name = name;
            this.rate = rate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }
    }
    private String fname;
    private String lname;
    private List<account> accounts;
    private List<Values> values;

    public bank(String fname, String lname, List<account> accounts, List<Values> values) {
        this.fname = fname;
        this.lname = lname;
        this.accounts = accounts;
        this.values = values;
    }
    //dropper getters og setters, se de private klassene for å se hvordan det funker

    @Override
    public void addMoney(double sum) {
    //sorter lista, og legger til den første som er der
        accounts.sort(((o1, o2) -> o1.name.compareTo(o2.name))); //komparator, ikke nødvendig for dape1400 I DET HELE TATT
        accounts.get(0).addmore(sum);
    }

    @Override
    public void addNewaccount(String Accname, double added) {
    accounts.add(new account(Accname, added));
    }
    public void removemoney(double cash){
        accounts.sort(((o1, o2) -> o1.name.compareTo(o2.name))); //komparator, ikke nødvendig for dape1400 I DET HELE TATT
        accounts.get(0).setBalance(accounts.get(0).getBalance() - cash );

    }
    @Override
    public double returnValueInanothervaluta(String valuta, String Accname) {
        double rate = 0;
        double moneyInVal = 0;
        for (Values v : values){
            if (v.getName() == valuta) rate = v.getRate();
        }
        for (account c : accounts){
            if (c.getName() == Accname) moneyInVal = c.getBalance();
        }
        return rate * moneyInVal;
    } //implemterer interface

}

