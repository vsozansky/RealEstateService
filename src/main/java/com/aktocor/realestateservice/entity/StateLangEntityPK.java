package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StateLangEntityPK implements Serializable {
    @Column(name = "id_state", nullable = false)
    @Id
    private Integer idState;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public StateLangEntityPK() {
    }

    public StateLangEntityPK(Integer idState, Integer idLang) {
        this.idState = idState;
        this.idLang = idLang;
    }

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
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
        StateLangEntityPK that = (StateLangEntityPK) o;
        return Objects.equals(idState, that.idState) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idState, idLang);
    }

    @Override
    public String toString() {
        return "StateLangEntityPK{" +
                "idState=" + idState +
                ", idLang=" + idLang +
                '}';
    }
}
