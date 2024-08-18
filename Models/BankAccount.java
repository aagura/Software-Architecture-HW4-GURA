package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    public int card;
    public float balance;

    public int getCard() {
        return card;
    }

    public float getBalance() {
        return balance;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public BankAccount(int card) {
        this.card = card;
        this.balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
