package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country_lang", schema = "ps1761", catalog = "")
@IdClass(CountryLangEntityPK.class)
public class CountryLangEntity {
    private int idCountry;
    private int idLang;
    private String name;

    @Id
    @Column(name = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Id
    @Column(name = "id_lang", nullable = false)
    public int getIdLang() {
        return idLang;
    }

    public void setIdLang(int idLang) {
        this.idLang = idLang;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 64)
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
        CountryLangEntity that = (CountryLangEntity) o;
        return idCountry == that.idCountry &&
                idLang == that.idLang &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, idLang, name);
    }
}
