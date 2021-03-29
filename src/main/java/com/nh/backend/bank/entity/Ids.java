package com.nh.backend.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "ids")
public class Ids {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "id_private")
    private Long idPrivate;

    @Column(name = "id_public")
    private String idPublic;

    @Column(name = "time")
    private long time;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPrivate() {
        return this.idPrivate;
    }

    public void setIdPrivate(Long idPrivate) {
        this.idPrivate = idPrivate;
    }

    public String getIdPublic() {
        return this.idPublic;
    }

    public void setIdPublic(String idPublic) {
        this.idPublic = idPublic;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
