package com.cipipeline.payment;

public class Payment {

    private int paymentId;
    private String status;
    private double amount;

    public Payment(int paymentId, String status, double amount) {
        this.paymentId = paymentId;
        this.status = status;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }
}