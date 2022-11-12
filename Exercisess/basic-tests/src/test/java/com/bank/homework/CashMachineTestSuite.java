package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine machine = new CashMachine();

        assertEquals(0, machine.getNumberOfExecutedTransactions());
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine machine = new CashMachine();
        machine.add(100);
        machine.add(-100);


        assertEquals(2, machine.getNumberOfExecutedTransactions());
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine machine = new CashMachine();
        machine.add(400);
        machine.add(200);
        machine.add(-200);
        machine.add (-400);
        machine.add(1000);

        assertEquals(1000, machine.balances(), 0.01);
    }

    @Test
    public void shouldCalculateNumberOfDeposits() {
        CashMachine machine = new CashMachine();
        machine.add(100);
        machine.add(-100);
        machine.add(150);
        assertEquals(2, machine.sumNumberOfDeposits(), 0.01);
    }

    @Test
    public void shouldCalculateNumberOfCredits() {
        CashMachine machine = new CashMachine();
        machine.add(100);
        machine.add(-100);
        machine.add(150);
        assertEquals(1, machine.sumNumberOfCredits(), 0.01);
    }
    @Test
    public void shouldReturnZeroWhenNotEnoughDeposit() {
        CashMachine machine = new CashMachine();
        machine.add(100);
        machine.add(100);
        machine.add(-250);
        assertEquals(0, machine.sumNumberOfCredits(), 0.01);
    }

    @Test
    public void shouldCalculateSumOfDeposits() {
        CashMachine machine = new CashMachine();
        machine.add(400);
        machine.add(200);
        machine.add(-200);
        machine.add(-400);
        machine.add(1000);

        assertEquals(1600, machine.sumOfDeposits(), 0.01);
    }

    @Test
    public void shouldCalculateSumOfCredits() {
        CashMachine machine = new CashMachine();
        machine.add(400);
        machine.add(200);
        machine.add(-200);
        machine.add(-400);
        machine.add(1000);

        assertEquals(-600, machine.sumOfCredits(), 0.01);
    }
}
