package com.me.yono;

import com.me.yono.sbi.current.CurrentAccount;
import com.me.yono.sbi.savings.SavingsAccount;

public class BankExec {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
       BankAccount myAccount =new SavingsAccount();
        BankAccount momsAccount=new SavingsAccount();
        BankAccount friendsAccount=new SavingsAccount();
        BankAccount brothersAccount=new SavingsAccount();
        BankAccount sistersaccount=new SavingsAccount();
        BankAccount dadsAccount=new SavingsAccount();
        BankAccount muraliEgg =new CurrentAccount();
        BankAccount balaji =new CurrentAccount();
        BankAccount mahalashmi =new CurrentAccount();
        myAccount.credit(5000);
        myAccount.transfer(2000,friendsAccount);
        myAccount.transfer(100,momsAccount);
        myAccount.transfer(100,brothersAccount);
        myAccount.transfer(100,sistersaccount);
        myAccount.transfer(100,dadsAccount);
        myAccount.transfer(100,muraliEgg);
        myAccount.transfer(100,balaji);
        myAccount.transfer(100,mahalashmi);

        System.out.println("Friend account balance "+ friendsAccount.getBalance());
        System.out.println("Mom's account balance "+ momsAccount.getBalance());
        System.out.println("Brother's account balance "+ brothersAccount.getBalance());
        System.out.println("Dad's account balance "+ dadsAccount.getBalance());
        System.out.println("Murali's account balance "+ muraliEgg.getBalance());
        System.out.println("Balaji's account balance "+ balaji.getBalance());
        System.out.println("Maha Lakshmi's account balance "+ mahalashmi.getBalance());
        System.out.println("My account balance "+myAccount.getBalance());


    }
}
