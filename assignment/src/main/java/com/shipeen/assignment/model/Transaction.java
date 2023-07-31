package com.shipeen.assignment.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;
    @Column(name="order_id")
    private Long orderId;

    @Column(name="payment_id")
    private Long paymentId;
    @Column(name="amount")
    private Double amount;

    @Column(name = "create_date")
    private final LocalDateTime createDate=LocalDateTime.now();

    public Transaction() {
    }

    public Transaction(Long orderId, Long paymentId, Double amount) {
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return transactionId;
    }

    public void setId(Long id) {
        this.transactionId = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

}
