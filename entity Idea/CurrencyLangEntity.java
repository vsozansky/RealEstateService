package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "currency_lang", schema = "ps1761", catalog = "")
@IdClass(CurrencyLangEntityPK.class)
public class CurrencyLangEntity {
    private int idCurrency;
    private int idLang;
    private String name;
    private String symbol;

    @Id
    @Column(name = "id_currency", nullable = false)
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
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
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "symbol", nullable = false, length = 255)
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyLangEntity that = (CurrencyLangEntity) o;
        return idCurrency == that.idCurrency &&
                idLang == that.idLang &&
                Objects.equals(name, that.name) &&
                Objects.equals(symbol, that.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurrency, idLang, name, symbol);
    }
}
