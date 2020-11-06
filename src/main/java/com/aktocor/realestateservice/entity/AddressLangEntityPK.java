package com.aktocor.realestateservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AddressLangEntityPK implements Serializable {
    @Column(name = "id_address", nullable = false)
    @Id
    private Integer idAddress;

    @Column(name = "id_lang", nullable = false)
    @Id
    private Integer idLang;

    public AddressLangEntityPK() {
    }

    public AddressLangEntityPK(Integer idAddress, Integer idLang) {
        this.idAddress = idAddress;
        this.idLang = idLang;
    }

    public Integer getidAddress() {
        return idAddress;
    }

    public void setidAddress(Integer idAddress) {
        this.idAddress = idAddress;
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
        AddressLangEntityPK that = (AddressLangEntityPK) o;
        return Objects.equals(idAddress, that.idAddress) &&
                Objects.equals(idLang, that.idLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAddress, idLang);
    }

    @Override
    public String toString() {
        return "AddressLangEntityPK{" +
                "idAddress=" + idAddress +
                ", idLang=" + idLang +
                '}';
    }
}
