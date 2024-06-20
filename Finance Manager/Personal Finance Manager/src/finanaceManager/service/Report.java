package finanaceManager.service;

import finanaceManager.model.Transaction;

import java.util.List;

public class Report {
    private List<Transaction> transactions;

    public Report(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void generateReport() {
        for (Transaction transaction : transactions) {
            System.out.println("Date: " + transaction.getDate());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Type: " + transaction.getType());
            System.out.println("Category: " + transaction.getCategory());
            System.out.println("Description: " + transaction.getDescription());
        }
    }

}
