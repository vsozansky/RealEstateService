package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TypeRealEstateLangEntityPK implements Serializable {
    @Column(name = "id_type", nullable = false)
    @Id
    private Integer idType;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public TypeRealEstateLangEntityPK() {
    }

    public TypeRealEstateLangEntityPK(Integer idType, Integer idLang) {
        this.idType = idType;
        this.idLang = idLang;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeRealEstateLangEntityPK that = (TypeRealEstateLangEntityPK) o;
        return Objects.equals(idType, that.idType) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, idLang);
    }

    @Override
    public String toString() {
        return "TypeRealEstateLangEntityPK{" +
                "idType=" + idType +
                ", idLang=" + idLang +
                '}';
    }
}
