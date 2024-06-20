package finanaceManager.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private List<Transaction> transactions;

    public Account() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        if (transaction.getType().equals("income")) {
            balance += transaction.getAmount();
        } else {
            balance -= transaction.getAmount();
        }
    }

    public void removeTransaction(Transaction transaction) {
        transactions.remove(transaction);
        if (transaction.getType().equals("income")) {
            balance -= transaction.getAmount();
        } else {
            balance += transaction.getAmount();
        }
    }

    public double getBalance() {
        return balance;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
    
}
