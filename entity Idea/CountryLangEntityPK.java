package com.jprestashop.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CountryLangEntityPK implements Serializable {
    private int idCountry;
    private int idLang;

    @Column(name = "id_country", nullable = false)
    @Id
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Column(name = "id_lang", nullable = false)
    @Id
    public int getIdLang() {
        return idLang;
    }

    public void setIdLang(int idLang) {
        this.idLang = idLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLangEntityPK that = (CountryLangEntityPK) o;
        return idCountry == that.idCountry &&
                idLang == that.idLang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, idLang);
    }
}
