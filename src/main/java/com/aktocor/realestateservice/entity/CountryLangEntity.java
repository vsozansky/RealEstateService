package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country_lang")
@IdClass(CountryLangEntityPK.class)
public class CountryLangEntity {
    @Id
    @Column(name = "id_country", nullable = false)
    private Integer idCountry;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public CountryLangEntity() {
    }

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
        return Objects.equals(idCountry, that.idCountry) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, idLang, name);
    }

    @Override
    public String toString() {
        return "CountryLangEntity{" +
                "idCountry=" + idCountry +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
