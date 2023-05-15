package org.example.Classes;

public class Order {

    private final int id;
    private String date;
    private String status;
    private Invoice invoice;

    public Order(int id, String date, String status, Invoice invoice) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.invoice = invoice;
    }

    public Order(int id, String date, String status) {
        this.id = id;
        this.date = date;
        this.status = status;
    }

    public Order(int id, String date) {
        this.id = id;
        this.date = date;
    }

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                ", invoice=" + invoice +
                '}';
    }

}
