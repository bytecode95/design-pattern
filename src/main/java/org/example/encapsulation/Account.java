package org.example.encapsulation;

public class Account {
    private String name;
    private float balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(balance>=0){
            this.balance = balance;
        }

    }
}
