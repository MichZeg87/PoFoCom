//package com.kodilla.bank.homework;
//
//public class Transactions {
//    private CashMachine deposit;
//    private CashMachine withdrawal;
//    private int transactionNumber;
//    private CashMachine balance;
//    private int startingBalance;
//
//
//    public Transactions(int transactionNumber) {
//        this.deposit = new CashMachine();
//        this.withdrawal = new CashMachine();
//        this.transactionNumber = transactionNumber;
//        this.balance = new CashMachine();
//        this.startingBalance = 10000;
//
//
//
//    }
//
//
//    public void addTransactionDeposit(int cash) {
//        if (cash > 0 && cash < 1000) {
//            this.deposit.add(cash);
//
//
//
//        }
//    }
//
//    public void addTransactionWithdrawal(int cash) {
//        if(getBalances() !=0 && cash > -1000 && cash <0 && getBalances()> cash) {
//            this.withdrawal.add(cash);
//
//        }
//    }
//
//
//
//
//    public double getBalances() {
//       double sum = this.startingBalance +
//               this.withdrawal.balances() +
//               this.balance.balances() +
//               this.deposit.balances();
//            return sum;
//    }
//
//    public CashMachine getDeposit(){
//        return deposit;
//    }
//
//    public CashMachine getWithdrawal(){
//        return withdrawal;
//    }
//
//}
