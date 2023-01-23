package com.company;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void shouldCalculateBalance() {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        List<Customer> customerAccounts = new ArrayList<>();
        AccountRecord accountRecord1 = new AccountRecord();
        AccountRecord accountRecord2 = new AccountRecord();
        AccountRecord accountRecord3 = new AccountRecord();
        AccountRecord accountRecord4 = new AccountRecord();

        // mock customer 1
        customer1.setId(1);
        customer1.setName("Customer1");
        customerAccounts.add(customer1);
        accountRecord1.setCharge(1800);
        accountRecord1.setChargeDate("12-01-2021");
        accountRecord2.setCharge(-1000);
        accountRecord2.setChargeDate("12-02-2021");
        customer1.getCharges().add(accountRecord1);
        customer1.getCharges().add(accountRecord2);
        assertEquals(800, customer1.getBalance());

        // mock customer 2
        customer2.setId(2);
        customer2.setName("Customer2");
        customerAccounts.add(customer2);
        accountRecord1.setCharge(-4890);
        accountRecord1.setChargeDate("12-05-2021");
        accountRecord2.setCharge(-1500);
        accountRecord2.setChargeDate("12-07-2021");
        accountRecord3.setCharge(400);
        accountRecord3.setChargeDate("12-07-2021");
        accountRecord4.setCharge(5000);
        accountRecord4.setChargeDate("12-09-2021");
        customer2.getCharges().add(accountRecord1);
        customer2.getCharges().add(accountRecord2);
        customer2.getCharges().add(accountRecord3);
        customer2.getCharges().add(accountRecord4);
        assertEquals(-990, customer2.getBalance());

        // mock customer 3
        customer3.setId(3);
        customer3.setName("Customer3");
        customerAccounts.add(customer3);
        accountRecord1.setCharge(100000);
        accountRecord1.setChargeDate("12-05-2021");
        accountRecord2.setCharge(-1000);
        accountRecord2.setChargeDate("12-07-2021");
        accountRecord3.setCharge(1689);
        accountRecord3.setChargeDate("12-07-2021");
        accountRecord4.setCharge(-80000);
        accountRecord4.setChargeDate("12-09-2021");
        customer3.getCharges().add(accountRecord1);
        customer3.getCharges().add(accountRecord2);
        customer3.getCharges().add(accountRecord3);
        customer3.getCharges().add(accountRecord4);
        assertEquals(20689, customer3.getBalance());
    }

    @Test
    public void shouldPrintCustomer() {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        // mock customer 1
        customer1.setId(1);
        customer1.setName("Customer1");
        AccountRecord accountRecord1 = new AccountRecord();
        accountRecord1.setCharge(-4890);
        accountRecord1.setChargeDate("12-05-2021");
        customer1.getCharges().add(accountRecord1);
        assertEquals("1, Customer1, -4890", customer1.toString());

        // mock customer 2
        customer2.setId(2);
        customer2.setName("Customer2");
        AccountRecord accountRecord2 = new AccountRecord();
        accountRecord2.setCharge(10000);
        accountRecord2.setChargeDate("12-05-2021");
        customer2.getCharges().add(accountRecord2);
        assertEquals("2, Customer2, 10000", customer2.toString());

        // mock customer 3
        customer3.setId(3);
        customer3.setName("Customer3");
        AccountRecord accountRecord3 = new AccountRecord();
        accountRecord3.setCharge(-58920);
        accountRecord3.setChargeDate("12-05-2021");
        customer3.getCharges().add(accountRecord3);
        assertEquals("3, Customer3, -58920", customer3.toString());
    }



}