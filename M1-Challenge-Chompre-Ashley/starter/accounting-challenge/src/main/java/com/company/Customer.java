package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        int balance = 0;
        List<AccountRecord> charges = this.getCharges();
        for(AccountRecord r : charges) {
            balance += r.getCharge();
        }
        return balance;
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        int id = this.getId();
        String name = this.getName();
        int balance = this.getBalance();
        return id + ", " + name + ", " + balance;
    }
}
