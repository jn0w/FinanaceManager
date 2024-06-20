package finanaceManager.service;

import finanaceManager.model.Account;
import finanaceManager.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FinanceManager {
    private List<Account> accounts;

    public FinanceManager() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void generateReport(){
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
            System.out.println("Transactions:");
            for (Transaction transaction : account.getTransactions()) {
                System.out.println("Date: " + transaction.getDate());
                System.out.println("Amount: " + transaction.getAmount());
                System.out.println("Type: " + transaction.getType());
                System.out.println("Category: " + transaction.getCategory());
                System.out.println("Description: " + transaction.getDescription());
            }
        }
    }
}
