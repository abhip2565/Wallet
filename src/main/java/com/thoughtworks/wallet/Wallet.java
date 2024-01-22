package com.thoughtworks.wallet;


public class Wallet {
    
    private Rupee balance;
    
    public Wallet() throws Exception{
        this.balance=new Rupee(0);
       
    }

    public void put(Rupee rupee) throws Exception 
    {
        this.balance=balance.add(rupee,balance);
    }

    public Rupee balance()
    {
        return this.balance;
    }

}
