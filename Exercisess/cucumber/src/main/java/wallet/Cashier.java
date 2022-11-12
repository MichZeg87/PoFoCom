package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdraw(Wallet wallet, int amount){
        if (amount<= wallet.getBalance()) {
            System.out.println("You don`t have enough money");
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
    }
}
