package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "currency_lang")
@IdClass(CurrencyLangEntityPK.class)
public class CurrencyLangEntity {
    @Id
    @Column(name = "id_currency", nullable = false)
    private int idCurrency;

    @Id
    @Column(name = "id_lang", nullable = false)
    private int idLang;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Basic
    @Column(name = "symbol", nullable = false, length = 64)
    private String symbol;

    public CurrencyLangEntity() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "CurrencyLangEntity{" +
                "idCurrency=" + idCurrency +
                ", idLang=" + idLang +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
