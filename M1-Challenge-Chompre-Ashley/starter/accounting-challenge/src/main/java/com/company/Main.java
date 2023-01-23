package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        for (int i=0; i < customerData.size(); i++) {
            int id = Integer.parseInt(customerData.get(i)[0]);
            Customer curr = new Customer();
            if(ids.contains(id)) {
                for(Customer c : customers) {
                    if (c.getId() == id) {
                        curr = c;
                        break;
                    }
                }
            } else {
                customers.add(curr);
                ids.add(id);
                curr.setId(id);
                curr.setName(customerData.get(i)[1]);
            }
            AccountRecord r = new AccountRecord();
            int charge = Integer.parseInt(customerData.get(i)[2]);
            String chargeDate = customerData.get(i)[3];
            r.setCharge(charge);
            r.setChargeDate(chargeDate);
            curr.getCharges().add(r);
        }
        System.out.println("All customers:");
        for(Customer c: customers) {
            System.out.println(c.toString());
        }
        List<Customer> positive = new ArrayList<Customer>();
        List<Customer> negative = new ArrayList<Customer>();
        for(Customer c: customers) {
            if(c.getBalance() < 0) {
                negative.add(c);
            } else {
                positive.add(c);
            }
        }
        System.out.println("Positive accounts:");
        for(Customer p: positive) {
            System.out.println(p.toString());
        }
        System.out.println("Negative accounts:");
        for(Customer n: negative) {
            System.out.println(n.toString());
        }
    }
}
