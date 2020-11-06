package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CityLangEntityPK implements Serializable {
    @Column(name = "id_city", nullable = false)
    @Id
    private Integer idCity;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public CityLangEntityPK() {
    }

    public CityLangEntityPK(Integer idCity, Integer idLang) {
        this.idCity = idCity;
        this.idLang = idLang;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
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
        CityLangEntityPK that = (CityLangEntityPK) o;
        return Objects.equals(idCity, that.idCity) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, idLang);
    }

    @Override
    public String toString() {
        return "CityLangEntityPK{" +
                "idCity=" + idCity +
                ", idLang=" + idLang +
                '}';
    }
}
