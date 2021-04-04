package com.nh.backend.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_document")
public class UsersDocument {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "living_country")
    private String livingCountry;

    @Column(name = "type")
    private String type;

    @Column(name = "document_serial")
    private String documentSerial;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "issued_by")
    private String issuedBy;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "ident_number")
    private String identNumber;

    @Column(name = "family_status")
    private String familyStatus;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getLivingCountry() {
        return this.livingCountry;
    }

    public void setLivingCountry(String livingCountry) {
        this.livingCountry = livingCountry;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocumentSerial() {
        return this.documentSerial;
    }

    public void setDocumentSerial(String documentSerial) {
        this.documentSerial = documentSerial;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getIssuedBy() {
        return this.issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIdentNumber() {
        return this.identNumber;
    }

    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    public String getFamilyStatus() {
        return this.familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }
}
