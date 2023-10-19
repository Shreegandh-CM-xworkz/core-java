package com.me.yono;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println(amount+" Debited from your balance is "+balance);
        }
    }

    public void credit(int amount) {
        balance = balance + amount;
        System.out.println(amount +" Credited to your balance is "+balance);

    }
    public void transfer(int amount,BankAccount benificiary){
        this.debit(amount);
        benificiary.credit(amount);
    }
}
