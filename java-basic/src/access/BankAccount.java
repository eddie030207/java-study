package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서도 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    //public 메서도 : withdraw
    public void withDraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서도 : getBalance
    public int getBalance() {
        return balance;
    }


}
