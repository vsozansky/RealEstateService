package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reo_type_lang")
@IdClass(TypeRealEstateLangEntityPK.class)
public class TypeRealEstateLangEntity {
    @Id
    @Column(name = "id_type", nullable = false)
    private Integer idType;

    @Id
    @Column(name = "id_lang", nullable = false)
    private Integer idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public TypeRealEstateLangEntity() {
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
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
        TypeRealEstateLangEntity that = (TypeRealEstateLangEntity) o;
        return Objects.equals(idType, that.idType) &&
                Objects.equals(idLang, that.idLang) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, idLang, name);
    }

    @Override
    public String toString() {
        return "TypeRealEstateLangEntity{" +
                "idType=" + idType +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                '}';
    }
}
