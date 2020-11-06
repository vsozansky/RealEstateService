package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city_lang")
@IdClass(CityLangEntityPK.class)
public class CityLangEntity {
    @Id
    @Column(name = "id_city", nullable = false)
    private Integer idCity;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public CityLangEntity() {
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
        CityLangEntity that = (CityLangEntity) o;
        return Objects.equals(idCity, that.idCity) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, idLang, name);
    }

    @Override
    public String toString() {
        return "CityLangEntity{" +
                "idCity=" + idCity +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
