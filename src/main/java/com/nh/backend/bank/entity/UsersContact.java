package com.nh.backend.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_contact")
public class UsersContact {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tel_mob")
    private String telMob;

    @Column(name = "tel_home")
    private String telHome;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelMob() {
        return this.telMob;
    }

    public void setTelMob(String telMob) {
        this.telMob = telMob;
    }

    public String getTelHome() {
        return this.telHome;
    }

    public void setTelHome(String telHome) {
        this.telHome = telHome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
