package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StreetLangEntityPK implements Serializable {
    @Column(name = "id_street", nullable = false)
    @Id
    private Integer idStreet;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public StreetLangEntityPK() {
    }

    public StreetLangEntityPK(Integer idStreet, Integer idLang) {
        this.idStreet = idStreet;
        this.idLang = idLang;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetLangEntityPK that = (StreetLangEntityPK) o;
        return Objects.equals(idStreet, that.idStreet) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStreet, idLang);
    }

    @Override
    public String toString() {
        return "StreetLangEntityPK{" +
                "idStreet=" + idStreet +
                ", idLang=" + idLang +
                '}';
    }
}
