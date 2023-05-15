package org.example.Classes;

public class Invoice {

    private final int id;

    private double amount;

    private String date;

    private Client client;


    public Invoice(int id, double amount, String date, Client client) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.client = client;
    }

    public Invoice(int id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public Invoice(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Invoice(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", client=" + client +
                '}';
    }
}
