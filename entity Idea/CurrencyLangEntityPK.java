package com.jprestashop.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CurrencyLangEntityPK implements Serializable {
    private int idCurrency;
    private int idLang;

    @Column(name = "id_currency", nullable = false)
    @Id
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
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
        CurrencyLangEntityPK that = (CurrencyLangEntityPK) o;
        return idCurrency == that.idCurrency &&
                idLang == that.idLang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurrency, idLang);
    }
}
