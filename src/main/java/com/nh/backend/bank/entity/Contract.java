package com.nh.backend.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "users_id")
    private Long usersId;

    @Column(name = "type")
    private String type;

    @Column(name = "constantly")
    private String constantly;

    @Column(name = "currency")
    private String currency;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "amount")
    private double amount;

    @Column(name = "interest")
    private double interest;

    @Column(name = "notes")
    private String notes;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsersId() {
        return this.usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConstantly() {
        return this.constantly;
    }

    public void setConstantly(String constantly) {
        this.constantly = constantly;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return this.interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
