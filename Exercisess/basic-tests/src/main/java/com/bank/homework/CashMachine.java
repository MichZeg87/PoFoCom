package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;


    public CashMachine() {
        this.size = 0;
        this.values = new int[0];

    }


    public void add(int value) {
        if (value < 0 && Math.abs(value) > balances()) { // przerywa dodanie jeśli wypłata większa od salda
            return;
        }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
        System.out.println(this.values.length);
    }


    public int balances() { // saldo sumuje wplaty i wypłaty
        if (this.values.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }

    public int sumNumberOfDeposits() { // zlicza ilość wPłaty
        int counter = 0; // przechowuje ilość  wpłat
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                counter++; // po pętli obrocie pętli dodaje 1
            }
        }
        return counter;
    }

    public int sumNumberOfCredits() { // Zlicza ilość wYpłat
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                counter++;
            }
        }
        return counter;
    }

    public int getNumberOfExecutedTransactions() { // ilość wszystkich transakcji
        return size;
    }

    public int sumOfDeposits() { //zlicza wartość wPłat
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                counter += this.values[i];
            }
        }
        return counter;
    }

    public int sumOfCredits() {
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) { //zlicza wartość wypłat
            if (this.values[i] < 0) {
                counter += this.values[i];
            }
        }
        return counter;
    }
}
