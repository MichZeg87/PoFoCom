package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();

        assertEquals(0, bank.getNumberCashMachines());
    }

    @Test
    public void shouldAddTwoElementsToBankCashMachineArray() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        bank.add(one);
        bank.add(two);
        assertEquals(2, bank.getNumberCashMachines());
    }

    @Test
    public void shouldCalculateBalance() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine tree = new CashMachine();

        bank.add(one);
        bank.add(two);
        bank.add(tree);

        one.add(200);
        one.add(-100);
        two.add(300);
        two.add(-150);
        tree.add(100);
        tree.add(-120);

        assertEquals(350, bank.allBalance(), 0.01);
    }

    @Test
    public void shouldCalculateOfAllDepositsTransactions() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine tree = new CashMachine();

        bank.add(one);
        bank.add(two);
        bank.add(tree);

        one.add(200);
        one.add(-100);
        two.add(300);
        two.add(-150);
        tree.add(100);
        tree.add(-120);
        assertEquals(3, bank.allDepositsTransactions(), 0.01);
    }

    @Test
    public void shouldCalculateAllOfCreditsTransactions() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine tree = new CashMachine();

        bank.add(one);
        bank.add(two);
        bank.add(tree);

        one.add(200);
        one.add(-100);
        two.add(300);
        two.add(-150);
        tree.add(100);
        tree.add(-120);
        assertEquals(2, bank.allCreditTransactions(), 0.01);
    }
    @Test
    public void shouldNonNegativeBalance() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine tree = new CashMachine();

        bank.add(one);
        bank.add(two);
        bank.add(tree);

        one.add(100);
        one.add(-200);
        two.add(300);
        two.add(-400);
        tree.add(100);
        tree.add(-120);
        assertEquals(500, bank.allBalance(), 0.01);

    }

    @Test
    public void shouldCalculateAverageDeposits() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine tree = new CashMachine();

        bank.add(one);
        bank.add(two);
        bank.add(tree);

        one.add(100);
        one.add(-200);
        two.add(300);
        two.add(-400);
        tree.add(100);
        tree.add(-120);
        assertEquals(166, bank.averageDeposit(), 0.01);

    }

    @Test
    public void shouldCalculateAverageCredits() {
        Bank bank = new Bank();
        CashMachine one = new CashMachine();
        CashMachine two = new CashMachine();
        CashMachine tree = new CashMachine();

        bank.add(one);
        bank.add(two);
        bank.add(tree);

        one.add(300);
        one.add(-200);
        two.add(500);
        two.add(-400);
        tree.add(100);
        tree.add(-120);
        assertEquals(-200, bank.averageCredit(), 0.01);

    }
}


