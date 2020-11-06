package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "street_lang")
@IdClass(StreetLangEntityPK.class)
public class StreetLangEntity {
    @Id
    @Column(name = "id_street", nullable = false)
    private Integer idStreet;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public StreetLangEntity() {
    }

    public Integer getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(Integer idStreet) {
        this.idStreet = idStreet;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetLangEntity that = (StreetLangEntity) o;
        return Objects.equals(idStreet, that.idStreet) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStreet, idLang, name);
    }

    @Override
    public String toString() {
        return "StreetLangEntity{" +
                "idStreet=" + idStreet +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
