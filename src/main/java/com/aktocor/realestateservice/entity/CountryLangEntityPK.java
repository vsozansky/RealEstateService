package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CountryLangEntityPK implements Serializable {
    @Column(name = "id_country", nullable = false)
    @Id
    private Integer idCountry;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
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
        CountryLangEntityPK that = (CountryLangEntityPK) o;
        return Objects.equals(idCountry, that.idCountry) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, idLang);
    }

    @Override
    public String toString() {
        return "CountryLangEntityPK{" +
                "idCountry=" + idCountry +
                ", idLang=" + idLang +
                '}';
    }
}
