package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CurrencyLangEntityPK implements Serializable {
    @Column(name = "id_currency", nullable = false)
    @Id
    private int idCurrency;

    @Column(name = "id_lang", nullable = false)
    @Id
    private int idLang;

    public CurrencyLangEntityPK() {
    }

    public CurrencyLangEntityPK(int idCurrency, int idLang) {
        this.idCurrency = idCurrency;
        this.idLang = idLang;
    }

    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

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
        CurrencyLangEntityPK that = (CurrencyLangEntityPK) o;
        return idCurrency == that.idCurrency &&
                idLang == that.idLang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurrency, idLang);
    }

    @Override
    public String toString() {
        return "CurrencyLangEntityPK{" +
                "idCurrency=" + idCurrency +
                ", idLang=" + idLang +
                '}';
    }
}
