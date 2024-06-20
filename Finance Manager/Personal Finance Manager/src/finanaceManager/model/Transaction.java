package finanaceManager.model;

import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private String type; //either income or expense
    private String category;
    private String description;

    public Transaction(Date date, double amount, String type, String category, String description) {
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
