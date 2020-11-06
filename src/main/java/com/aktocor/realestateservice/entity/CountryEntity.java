package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country")
public class CountryEntity {
    @Id
    @Column(name = "id_country", nullable = false)
    private Integer idCountry;

    @Basic
    @Column(name = "id_zone", nullable = false)
    private Integer idZone;

    @Basic
    @Column(name = "id_currency", nullable = false)
    private Integer idCurrency;

    @Basic
    @Column(name = "iso_code", nullable = false, length = 3)
    private String isoCode;

    @Basic
    @Column(name = "call_prefix", nullable = false)
    private Integer callPrefix;

    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;

    @Basic
    @Column(name = "contains_states", nullable = false)
    private Boolean containsStates;

    @Basic
    @Column(name = "need_identification_number", nullable = false)
    private Boolean needIdentificationNumber;

    @Basic
    @Column(name = "need_zip_code", nullable = false)
    private Boolean needZipCode;

    @Basic
    @Column(name = "zip_code_format", nullable = false, length = 12)
    private String zipCodeFormat;

    @Basic
    @Column(name = "display_tax_label", nullable = false)
    private Boolean displayTaxLabel;

    public CountryEntity() {
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Integer getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(Integer callPrefix) {
        this.callPrefix = callPrefix;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getContainsStates() {
        return containsStates;
    }

    public void setContainsStates(Boolean containsStates) {
        this.containsStates = containsStates;
    }

    public Boolean getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(Boolean needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    public Boolean getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(Boolean needZipCode) {
        this.needZipCode = needZipCode;
    }

    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    public Boolean getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(Boolean displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return Objects.equals(idCountry, that.idCountry) &&
                Objects.equals(idZone, that.idZone) &&
                Objects.equals(idCurrency, that.idCurrency) &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(callPrefix, that.callPrefix) &&
                Objects.equals(active, that.active) &&
                Objects.equals(containsStates, that.containsStates) &&
                Objects.equals(needIdentificationNumber, that.needIdentificationNumber) &&
                Objects.equals(needZipCode, that.needZipCode) &&
                Objects.equals(zipCodeFormat, that.zipCodeFormat) &&
                Objects.equals(displayTaxLabel, that.displayTaxLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, idZone, idCurrency, isoCode, callPrefix, active, containsStates, needIdentificationNumber, needZipCode, zipCodeFormat, displayTaxLabel);
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
                "idCountry=" + idCountry +
                ", idZone=" + idZone +
                ", idCurrency=" + idCurrency +
                ", isoCode='" + isoCode + '\'' +
                ", callPrefix=" + callPrefix +
                ", active=" + active +
                ", containsStates=" + containsStates +
                ", needIdentificationNumber=" + needIdentificationNumber +
                ", needZipCode=" + needZipCode +
                ", zipCodeFormat='" + zipCodeFormat + '\'' +
                ", displayTaxLabel=" + displayTaxLabel +
                '}';
    }
}
