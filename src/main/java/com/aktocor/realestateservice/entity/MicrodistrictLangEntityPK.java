package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MicrodistrictLangEntityPK implements Serializable {
    @Column(name = "id_microdistrict", nullable = false)
    @Id
    private Integer idMicrodistrict;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public MicrodistrictLangEntityPK() {
    }

    public MicrodistrictLangEntityPK(Integer idMicrodistrict, Integer idLang) {
        this.idMicrodistrict = idMicrodistrict;
        this.idLang = idLang;
    }

    public Integer getIdMicrodistrict() {
        return idMicrodistrict;
    }

    public void setIdMicrodistrict(Integer idMicrodistrict) {
        this.idMicrodistrict = idMicrodistrict;
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
        MicrodistrictLangEntityPK that = (MicrodistrictLangEntityPK) o;
        return Objects.equals(idMicrodistrict, that.idMicrodistrict) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMicrodistrict, idLang);
    }

    @Override
    public String toString() {
        return "MicrodistrictLangEntityPK{" +
                "idMicrodistrict=" + idMicrodistrict +
                ", idLang=" + idLang +
                '}';
    }
}
