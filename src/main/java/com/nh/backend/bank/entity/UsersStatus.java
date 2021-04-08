package com.nh.backend.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_status")
public class UsersStatus {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "users_id")
    private Long usersId;


    @Column(name = "disability")
    private String disability;

    @Column(name = "retiree")
    private Boolean retiree;

    @Column(name = "monthly_income")
    private double monthlyIncome;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsersId(){
        return this.usersId;
    }
    public void setUsersId(Long usersId){
        this.usersId=usersId;
    }

    public String getDisability() {
        return this.disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public Boolean getRetiree() {
        return this.retiree;
    }

    public void setRetiree(Boolean retiree) {
        this.retiree = retiree;
    }

    public double getMonthlyIncome() {
        return this.monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
