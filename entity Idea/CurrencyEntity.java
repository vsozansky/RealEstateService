package com.jprestashop.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "currency", schema = "ps1761", catalog = "")
public class CurrencyEntity {
    private int idCurrency;
    private String name;
    private String isoCode;
    private String numericIsoCode;
    private int precision;
    private BigDecimal conversionRate;
    private byte deleted;
    private byte active;

    @Id
    @Column(name = "id_currency", nullable = false)
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "iso_code", nullable = false, length = 3)
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @Basic
    @Column(name = "numeric_iso_code", nullable = true, length = 3)
    public String getNumericIsoCode() {
        return numericIsoCode;
    }

    public void setNumericIsoCode(String numericIsoCode) {
        this.numericIsoCode = numericIsoCode;
    }

    @Basic
    @Column(name = "precision", nullable = false)
    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Basic
    @Column(name = "conversion_rate", nullable = false, precision = 6)
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    @Basic
    @Column(name = "deleted", nullable = false)
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyEntity that = (CurrencyEntity) o;
        return idCurrency == that.idCurrency &&
                precision == that.precision &&
                deleted == that.deleted &&
                active == that.active &&
                Objects.equals(name, that.name) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(numericIsoCode, that.numericIsoCode) &&
                Objects.equals(conversionRate, that.conversionRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurrency, name, isoCode, numericIsoCode, precision, conversionRate, deleted, active);
    }
}
