package JavaProject.BankSystemSwing.src;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Comparable<Transaction>, Serializable {
//this is serializable bcz transaction save on disks
    private static int next = 1;
    int transactionNumb;
    Account account;
    LocalDate date;
    char operation;
    double amount;

    public Transaction(Account account, LocalDate date, char operation, double amount) {
        this.account = account;
        this.date = date;
        this.operation = operation;
        this.amount = amount;
        transactionNumb = next++;//every new transaction is increased by one
    }

    @Override
    public int compareTo(Transaction o) {
        /* We are comparing this transaction number with the
         transaction number that has already saved */
        return this.transactionNumb - o.transactionNumb;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionNumb=" + transactionNumb +
                ", account=" + account +
                ", date=" + date +
                ", operation=" + operation +
                ", amount=" + amount +
                '}';
    }

    //now we create getters for our class
    public int getTransactionNumb() {
        return transactionNumb;
    }

    public Account getAccount() {
        return account;
    }

    public LocalDate getDate() {
        return date;
    }

    public char getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }
}
