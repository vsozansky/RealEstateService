package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "currency")
public class CurrencyEntity {
    @Id
    @Column(name = "id_currency", nullable = false)
    private Integer idCurrency;

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Basic
    @Column(name = "iso_code", nullable = false, length = 3)
    private String isoCode;

    @Basic
    @Column(name = "numeric_iso_code", nullable = true, length = 3)
    private String numericIsoCode;

    @Basic
    @Column(name = "precision", nullable = false)
    private Integer precision;

    @Basic
    @Column(name = "conversion_rate", nullable = false, precision = 6)
    private BigDecimal conversionRate;

    @Basic
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    public CurrencyEntity() {
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getNumericIsoCode() {
        return numericIsoCode;
    }

    public void setNumericIsoCode(String numericIsoCode) {
        this.numericIsoCode = numericIsoCode;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyEntity that = (CurrencyEntity) o;
        return Objects.equals(idCurrency, that.idCurrency) &&
                Objects.equals(name, that.name) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(numericIsoCode, that.numericIsoCode) &&
                Objects.equals(precision, that.precision) &&
                Objects.equals(conversionRate, that.conversionRate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurrency, name, isoCode, numericIsoCode, precision, conversionRate, deleted, active);
    }

    @Override
    public String toString() {
        return "CurrencyEntity{" +
                "idCurrency=" + idCurrency +
                ", name='" + name + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", numericIsoCode='" + numericIsoCode + '\'' +
                ", precision=" + precision +
                ", conversionRate=" + conversionRate +
                ", deleted=" + deleted +
                ", active=" + active +
                '}';
    }
}
