package com.jprestashop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "ps1761", catalog = "")
public class CountryEntity {
    private int idCountry;
    private int idZone;
    private int idCurrency;
    private String isoCode;
    private int callPrefix;
    private byte active;
    private byte containsStates;
    private byte needIdentificationNumber;
    private byte needZipCode;
    private String zipCodeFormat;
    private byte displayTaxLabel;

    @Id
    @Column(name = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Basic
    @Column(name = "id_zone", nullable = false)
    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Basic
    @Column(name = "id_currency", nullable = false)
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
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
    @Column(name = "call_prefix", nullable = false)
    public int getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(int callPrefix) {
        this.callPrefix = callPrefix;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Basic
    @Column(name = "contains_states", nullable = false)
    public byte getContainsStates() {
        return containsStates;
    }

    public void setContainsStates(byte containsStates) {
        this.containsStates = containsStates;
    }

    @Basic
    @Column(name = "need_identification_number", nullable = false)
    public byte getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(byte needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    @Basic
    @Column(name = "need_zip_code", nullable = false)
    public byte getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(byte needZipCode) {
        this.needZipCode = needZipCode;
    }

    @Basic
    @Column(name = "zip_code_format", nullable = false, length = 12)
    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    @Basic
    @Column(name = "display_tax_label", nullable = false)
    public byte getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(byte displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return idCountry == that.idCountry &&
                idZone == that.idZone &&
                idCurrency == that.idCurrency &&
                callPrefix == that.callPrefix &&
                active == that.active &&
                containsStates == that.containsStates &&
                needIdentificationNumber == that.needIdentificationNumber &&
                needZipCode == that.needZipCode &&
                displayTaxLabel == that.displayTaxLabel &&
                Objects.equals(isoCode, that.isoCode) &&
                Objects.equals(zipCodeFormat, that.zipCodeFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, idZone, idCurrency, isoCode, callPrefix, active, containsStates, needIdentificationNumber, needZipCode, zipCodeFormat, displayTaxLabel);
    }
}
